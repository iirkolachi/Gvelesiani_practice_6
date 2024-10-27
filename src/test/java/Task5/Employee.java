package Task5;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("Employee name - " + name);
        System.out.println("Employee salary - " + salary);
    }
}
