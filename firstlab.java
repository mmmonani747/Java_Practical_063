public class firstlab {
    static{
        System.out.println("first");

    }
    public static void main(String args[]) {
        System.out.println("hello world");
       
        firstclass();
        secondclass();
        thirdclass();
   
    }
    static{
        System.out.println("first");

    }
    public static void firstclass() {
        System.out.println("first");
    }

    public static void secondclass  (){
        System.out.println("second");

    }

    public static int thirdclass() {
        System.out.println("third");
        return 0;
}
}