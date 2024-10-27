package Task5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jemal", 1700);
        System.out.println("Employee details: ");
        employee.displayDetails();
        System.out.println();

        Manager manager = new Manager("Giorgi",2600,"Public Debt Management");
        System.out.println("Manager details: ");
        manager.displayDetails();
    }
}
