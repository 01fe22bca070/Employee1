//DevOpsEngineer.java
public class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeID, double salary, double bonus) {
        super(name, employeeID, salary);
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return salary + bonus;
    }

    public String getTotalSalaryFormatted() {
        return "$" + (salary + bonus);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Bonus: $" + bonus);
        System.out.println("Total Salary: " + getTotalSalaryFormatted());
    }
}