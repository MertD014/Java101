import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double height=s1.nextDouble();
        System.out.print("Enter your weight in kg: ");
        double weight=s1.nextDouble();
        System.out.print("Your BMI: " + weight/((height/100)*(height/100)));
        s1.close();
    }
}
