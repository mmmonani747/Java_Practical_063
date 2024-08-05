public class Practical20{
    public static void main(String[] args) {
        square s1 = new square();
        s1.print();
    }
}
class Shape{
    void print()
    {
        System.out.println("This is shapoe.");;

    }
}
class rectangle extends Shape
{   
    void print()
    {
        System.out.println("this is rectangle");
    }
}
class  square extends rectangle{
    square()
    {
        System.out.println("Square is a rectangle");
    }
}
class circle extends Shape
{   
    void print()
    {
        System.out.println("this is circle");
    }
}
