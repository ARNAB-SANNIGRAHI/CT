package interface_codes;

/* ---------- Employee2 Class ---------- */
class Employee2 {
    int id;
    String name;
    double salary;
    int experience;
    String department;

    Employee2(int id, String name, double salary, int experience, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.department = department;
    }
}

/* ---------- EmployeeService Interface ---------- */
interface EmployeeService {
    Employee2[] getHighSalaryEmployee(Employee2[] employees, double minSalary);

    double calculateAverageSalary(Employee2[] employees);

    Employee2 getTopPaidEmployee(Employee2[] employees);

    Employee2[] getExperiencedEmployees(Employee2[] employees, int minYears);

    Employee2 getTopPaidEmployeeByDepartment(Employee2[] employees, String department);

    double getAverageSalaryByDepartment(Employee2[] employees, String department);
}

/* ---------- Implementation Class ---------- */
class EmployeeServiceImp implements EmployeeService {

    public Employee2[] getHighSalaryEmployee(Employee2[] employees, double minSalary) {
        int c = 0;
        for (Employee2 e : employees)
            if (e.salary >= minSalary) c++;

        Employee2[] res = new Employee2[c];
        int i = 0;
        for (Employee2 e : employees)
            if (e.salary >= minSalary) res[i++] = e;

        return res;
    }

    public double calculateAverageSalary(Employee2[] employees) {
        double sum = 0;
        for (Employee2 e : employees)
            sum += e.salary;
        return sum / employees.length;
    }

    public Employee2 getTopPaidEmployee(Employee2[] employees) {
        Employee2 top = employees[0];
        for (Employee2 e : employees)
            if (e.salary > top.salary) top = e;
        return top;
    }

    public Employee2[] getExperiencedEmployees(Employee2[] employees, int minYears) {
        int c = 0;
        for (Employee2 e : employees)
            if (e.experience >= minYears) c++;

        Employee2[] res = new Employee2[c];
        int i = 0;
        for (Employee2 e : employees)
            if (e.experience >= minYears) res[i++] = e;

        return res;
    }

    public Employee2 getTopPaidEmployeeByDepartment(Employee2[] employees, String dept) {
        Employee2 top = null;
        for (Employee2 e : employees) {
            if (e.department.equals(dept)) {
                if (top == null || e.salary > top.salary)
                    top = e;
            }
        }
        return top;
    }

    public double getAverageSalaryByDepartment(Employee2[] employees, String dept) {
        double sum = 0;
        int c = 0;
        for (Employee2 e : employees) {
            if (e.department.equals(dept)) {
                sum += e.salary;
                c++;
            }
        }
        return c == 0 ? 0 : sum / c;
    }
}

/* ---------- Driver Class ---------- */
public class Employee_Assignment {
    public static void main(String[] args) {

        Employee2[] emp = {
            new Employee2(1, "Virat", 50000, 5, "IT"),
            new Employee2(2, "Rohit", 70000, 7, "HR"),
            new Employee2(3, "Dhoni", 60000, 4, "IT"),
            new Employee2(4, "Karan", 80000, 9, "HR")
        };

        EmployeeService service = new EmployeeServiceImp();

        System.out.println("Top Paid Employee: " +
                service.getTopPaidEmployee(emp).name);

        System.out.println("Average Salary: " +
                service.calculateAverageSalary(emp));

        System.out.println("IT Department Average Salary: " +
                service.getAverageSalaryByDepartment(emp, "IT"));

        System.out.println("High Salary Employees (>= 60000):");
        Employee2[] highPaid = service.getHighSalaryEmployee(emp, 60000);
        for (Employee2 e : highPaid)
            System.out.println(e.name + " - " + e.salary);

        System.out.println("Experienced Employees (>= 5 years):");
        Employee2[] experienced = service.getExperiencedEmployees(emp, 5);
        for (Employee2 e : experienced)
            System.out.println(e.name + " - " + e.experience + " years");

        System.out.println("Top Paid in HR Department: " +
                service.getTopPaidEmployeeByDepartment(emp, "HR").name);
    }
}
