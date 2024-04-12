import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the side lengths:");
        double sideA;
        double sideB;
        double sideC;
        sideA=s1.nextDouble();
        sideB=s1.nextDouble();
        sideC=s1.nextDouble();
        
        double sumU = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(sumU*(sumU-sideA)*(sumU-sideB)*(sumU-sideC)); 

        System.out.println("Area of triangle is " + area);
        s1.close();
    }
}
