class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {
        System.out.println("Area of Rectangle is " + length * breadth);
    }

    void printPerimeter() {
        System.out.println("Perimeter of Rectangle is " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
    }
}

public class practical19{
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(10, 20);
        rectangles[1] = new Square(15);
        rectangles[2] = new Rectangle(25, 30);
        for (Rectangle rectangle : rectangles) {
            rectangle.printArea();
            rectangle.printPerimeter();

        }
    }
}