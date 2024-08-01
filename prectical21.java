 class Degree {
     void getDegree() {
        System.out.println("I got a degree");
    }
}

 class Undergraduate extends Degree {
     void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

 class Postgraduate extends Degree {
     void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

 public class prectical21 {
    public  static void main(String[] args) {
        Degree degree = new Degree();
        degree.getDegree(); // Output: I got a degree

        Undergraduate undergraduate = new Undergraduate();
        undergraduate.getDegree(); // Output: I am an Undergraduate

        Postgraduate postgraduate = new Postgraduate();
        postgraduate.getDegree(); // Output: I am a Postgraduate
    }
}