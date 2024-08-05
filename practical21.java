public class practical21 {
    public static void main(String[] args) {
        Degree d1 = new Degree();
        UG d2 = new UG();
        PG d3 = new PG();
        d1.gotDegree();
        d2.gotDegree();
        d3.gotDegree();
    }
}
class Degree{
    void gotDegree()
    {
        System.out.println("I Got The Degree");
    }
}
class UG extends Degree{
    void gotDegree(){
        System.out.println("I Got The Under Graduate Degree");

    }
}
class PG extends Degree{
    void gotDegree()
    {
        System.out.println("I Got The Post Graduate Degree");

        
    }
}