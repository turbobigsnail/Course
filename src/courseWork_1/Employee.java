package courseWork_1;

public class Employee {
    private static int counter;
    private double salary;
    private String employeeName;
    private int department;
    private final long id;

    public Employee(double salary, String employeeName, int department) {
        this.salary = salary;
        this.employeeName = employeeName;
        this.department = department;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Employee " +
                " salary: " + salary +
                " fullName: " + employeeName +
                " department: " + department +
                " id: " + id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public long getId() {
        return id;
    }
}


