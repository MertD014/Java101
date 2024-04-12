import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the side lengths:");
        double A,B,C;
        A=s1.nextDouble();
        B=s1.nextDouble();
        C=s1.nextDouble();
        
        double U = (A+B+C)/2;
        double area = Math.sqrt(U*(U-A)*(U-B)*(U-C)); 

        System.out.println("Area of triangle is " + area);
    }
}
