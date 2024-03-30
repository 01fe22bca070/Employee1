// Employee.java
public class Employee {
    protected String name;
    protected int employeeID;
    protected double salary;

    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Salary: $" + salary);
    }
}


