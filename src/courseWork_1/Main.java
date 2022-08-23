package courseWork_1;

public class Main {
    static Employee[] employees = new Employee[20];

    public static void main(String[] args) {
        employees[0] = new Employee(1000, " Ivan Ivanov ", 5);
        employees[2] = new Employee(2000, " Ivan Petrov ", 4);
        employees[4] = new Employee(3000, " Ivan Krasnov  ", 3);
        employees[8] = new Employee(80, " Ivan Belov ", 2);
        employees[16] = new Employee(5000, " Ivan Chernov ", 1);

        System.out.println("список всех сотрудников: ");
        printAllEmployee();
        System.out.println("сумма зарплат: " + getCalculateSum());
        System.out.println("минимальная зарплата: " + getMinSalary());
        System.out.println("максимальная зарплата: " + getMaxSalary());
        System.out.println("средняя зарплата: " + getAverageSalaryEmployees());
        System.out.println("имена всех сотрудников: ");
        printAllEmployeesName();
        System.out.println("колво устроенных сотрудников: " + getNumberOfEmployees());
    }
    public static double getNumberOfEmployees() {
        double numbersEmpl = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                numbersEmpl++;
            }
        }
        return numbersEmpl;
    }
    public static void printAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static double getCalculateSum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }
    public static Employee getMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmployee = null;
        int indexOfNulls = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
                indexOfNulls = i;
                break;
            }
        }
        for (int i = indexOfNulls; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmployee = employees[i];
                }
            }
        }
        return minSalaryEmployee;
    }
    public static Employee getMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmployee = null;
        int indexOfNulls = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
                indexOfNulls = i;
                break;
            }
        }
        for (int i = indexOfNulls; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        return maxSalaryEmployee;
    }
    public static double getAverageSalaryEmployees() {
        if (employees.length != 0) {
            return getCalculateSum() / getNumberOfEmployees();
        } else {
            return 0;
        }
    }
    public static void printAllEmployeesName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getEmployeeName());
            }
        }
    }
}


