class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class M {
    public static void main(String[] args) {
        // Create an object of Employee class
        Employee employee = new Employee();
        employee.name = "John Doe";
        employee.age = 30;
        employee.phoneNumber = "123-456-7890";
        employee.address = "123 Main St";
        employee.salary = 50000;
        employee.specialization = "Software Engineer";

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary(); // Output: Salary: 50000

        // Create an object of Manager class
        Manager manager = new Manager();
        manager.name = "Jane Smith";
        manager.age = 40;
        manager.phoneNumber = "098-765-4321";
        manager.address = "456 Elm St";
        manager.salary = 70000;
        manager.department = "Human Resources";

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary(); // Output: Salary: 70000
    }
}