package day14_CollectionFramework;

	interface PayrollSystem {
	    double calculatePay();
	    double calculatePay(double bonus);
	}

	abstract class Payroll implements PayrollSystem {
	    private double salary;
	    private int id;
	    private String name;
	    private String role;

	    public Payroll(int id, String name, String role, double salary) throws InvalidSalaryException {
	        if (salary <= 0) {
	            throw new InvalidSalaryException("Invalid salary");
	        }
	        this.id = id;
	        this.name = name;
	        this.role = role;
	        this.salary = salary;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void updateSalary(double newSalary, String updatedByRole) throws InvalidSalaryException {
	        if (!updatedByRole.equalsIgnoreCase("HR")) {
	            throw new UnauthorizedAccessException("Access denied");
	        }
	        if (newSalary <= 0) {
	            throw new InvalidSalaryException("Invalid salary");
	        }
	        this.salary = newSalary;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getRole() {
	        return role;
	    }
	}

	class FullTimeEmployee extends Payroll {
	    public FullTimeEmployee(int id, String name, String role, double salary) throws InvalidSalaryException {
	        super(id, name, role, salary);
	    }

	    public double calculatePay() {
	        return getSalary();
	    }

	    public double calculatePay(double bonus) {
	        return getSalary() + bonus;
	    }
	}

	class ContractEmployee extends Payroll {
	    public ContractEmployee(int id, String name, String role, double salary) throws InvalidSalaryException {
	        super(id, name, role, salary);
	    }

	    public double calculatePay() {
	        return getSalary() * 0.9;
	    }

	    public double calculatePay(double bonus) {
	        return (getSalary() * 0.9) + bonus;
	    }
	}

	class UnauthorizedAccessException extends RuntimeException {
	    public UnauthorizedAccessException(String msg) {
	        super(msg);
	    }
	}

	class InvalidSalaryException extends Exception {
	    public InvalidSalaryException(String msg) {
	        super(msg);
	    }
	}

	public class EmployeeManagementSystem {
	    public static void main(String[] args) {
	        try {
	            Payroll e1 = new FullTimeEmployee(1, "Alice", "HR", 50000);
	            Payroll e2 = new ContractEmployee(2, "Bob", "Engineer", 40000);
	            Payroll e3 = new FullTimeEmployee(3, "Smith", "IT", 50000);
	            
	            System.out.println(e1.calculatePay());
	            System.out.println(e2.calculatePay(2000));
	            System.out.println(e3.calculatePay(5000));

	            System.out.println("---Updated/Incremented Salary---");
	            
	            e1.updateSalary(55000, "HR");
	            System.out.println(e1.calculatePay());

	            e2.updateSalary(45000, "HR");
	            System.out.println(e2.calculatePay(5000));
	            
	            e3.updateSalary(50000, "HR");
	            System.out.println(e3.calculatePay(2000));
	            
	            
	        } catch (InvalidSalaryException e) {
	            System.out.println(e.getMessage());
	        } catch (UnauthorizedAccessException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
