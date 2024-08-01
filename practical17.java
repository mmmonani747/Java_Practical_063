class Parent {
    void printtextParent() {
        System.out.println("this is parent class");
    }
}

class child extends Parent {
    void printtextChild() {
        System.out.println("this is child class");
    }
}

class grandchild extends child {
    void printtextGrandchild() {
        System.out.println("this is grandchild class");
    }
}

public class practical17 {
    public static void main(String[] args) {
        {
            Parent p1 = new Parent();
            child c = new child();
            grandchild gc = new grandchild();

            p1.printtextParent();
            c.printtextParent();
            c.printtextChild();
            gc.printtextParent();
            gc.printtextChild();
            gc.printtextGrandchild();

        }
    }
}