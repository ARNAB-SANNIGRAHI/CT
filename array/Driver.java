package array;

public class Driver {
    public static void main(String[] args) {

        Employee[] emp = {
            new Employee(1, "A", 40000),
            new Employee(2, "B", 60000),
            new Employee(3, "C", 50000)
        };

        EmployeeService service = new EmployeeServiceImp();

        Employee[] highPaid = service.getHighSalaryEmployee(emp, 50000);
        for (int i = 0; i < highPaid.length; i++)
            System.out.println(highPaid[i].name + " " + highPaid[i].salary);

        System.out.println("Average Salary: " +
                service.calculateAverageSalary(emp));

        Employee top = service.getTopPaidEmployee(emp);
        System.out.println("Top Paid: " + top.name + " " + top.salary);
    }
}
