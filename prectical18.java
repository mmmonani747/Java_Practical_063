class member
{
    public
    int age;
    String name;
    long phoneNumber;
    String address;
    int salary;
    // method printSalary
    public void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
    // assign age,name,phoneNumber,address,salary
    void insert(int age,String name,long phoneNumber,String address,int salary)
    {
        this.age=age;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.salary=salary;

    }
    void printBio()
    {
        // print all the details

        System.out.println("name is "+name);
        System.out.println("age is"+age);
        System.out.println("phone number is "+phoneNumber);
        System.out.println("address is"+address);
        System.out.println("salary is "+salary);
    }

}

class  Employee extends member
{public 
    String specializatioString;
    String departmentString;    
}

class Manager extends member{
    public 
    String specializatioString;
    String departmentString;
}

public class prectical18 {
    public static void main(String[] args) {
        Employee e1Employee=new Employee();
        Manager m1Manager=new Manager();
        e1Employee.insert(25,"John",1234567890,"New York",50000);
        m1Manager.insert(30,"Mike",987654321,"Los Angeles",60000);
        e1Employee.printBio();
        m1Manager.printBio();

        
    }
    
}
