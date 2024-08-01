
public class Main
 {
    public static void main (String[] args) {
        child1 c1 = new child1();
        child2 c2 = new child2();
    }
}

class base {
    base() {
        System.out.println("this is base class call");
    }
}

class child1 extends base {
    child1() {
        System.out.println("this is child 1");
    }
}

class child2 extends child1 {
    child2() {
        System.out.println("this is child 2");
    }
}
