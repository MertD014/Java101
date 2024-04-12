import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x1=s1.nextDouble();
        System.out.print("Enter the second number: ");
        double x2=s1.nextDouble();
        System.out.print("Enter the operator(+,-,x,/,%): ");
        String operator = s1.next();
        switch (operator) {
            case "+":
                System.out.println("Answer: " + (x1+x2));
                break;
            case "-":
                System.out.println("Answer: " + (x1-x2));
                break;
            case "x":
                System.out.println("Answer: " + (x1*x2));
                break;
            case "/":
                if(x2!=0) System.out.println("Answer: " + (x1/x2));
                else System.out.println("Division with 0!!");
                break;
            case "%":
                if(x2!=0) System.out.println("Answer: " + (x1%x2));
                else System.out.println("Division with 0!!");
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        s1.close();
    }
}
