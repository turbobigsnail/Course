package courseWork_1;

public class Main {
    static Employee[] employees = new Employee[6];

    public static void main(String[] args) {
        employees[0] = new Employee(1000, " Ivan Ivanov ", 5);
        employees[1] = new Employee(2000, " Ivan Petrov ", 4);
        employees[2] = new Employee(3000, " Ivan Krasnov  ", 3);
        employees[3] = new Employee(4000, " Ivan Belov ", 2);
        employees[4] = new Employee(5000, " Ivan Chernov ", 1);

        printAllEmployee();
    }

    public static void printAllEmployee() {

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}


