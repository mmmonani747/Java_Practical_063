import java.util.Scanner;

public class practical16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        System.out.print("\nEnter \n 1.Addition\n 2.Subtraction\n 3.Multiplication\n Your Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Complex result = c1.addition(c1, c2);
                System.out.println("Result: " + result.real + " + " + result.imaginary + "i");
                break;
            case 2:
                result = c1.subtraction(c1, c2);
                System.out.println("Result: " + result.real + " + " + result.imaginary + "i");
                break;
            case 3:
                result = c1.multiplication(c1, c2);
                System.out.println("Result: " + result.real + " + " + result.imaginary + "i");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

class Complex {
    double real, imaginary;

    Complex() {
        real = 0.0;
        imaginary = 0.0;
    }

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex addition(Complex x1, Complex y1) {
        Complex result = new Complex();
        result.real = x1.real + y1.real;
        result.imaginary = x1.imaginary + y1.imaginary;
        return result;
    }

    Complex subtraction(Complex x1, Complex y1) {
        Complex result = new Complex();
        result.real = x1.real - y1.real;
        result.imaginary = x1.imaginary - y1.imaginary;
        return result;
    }

    Complex multiplication(Complex x1, Complex y1) {
        Complex result = new Complex();
        result.real = x1.real * y1.real - x1.imaginary * y1.imaginary;
        result.imaginary = x1.real * y1.imaginary + y1.real * x1.imaginary;
        return result;
    }
}