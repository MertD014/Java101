import java.util.Scanner;


public class Taximeter {
    public static void main(String[] args) {
        double startingPrice = 10.0;
        double perKM = 2.2;
        double minPayment = 20.0; 
        
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the road lenght: ");
        double km = s1.nextDouble();

        double subTotal= startingPrice + km*perKM;

        if(subTotal<minPayment){
            System.out.println("You should pay " + minPayment);
        }
        else{
            System.out.println("You shoul pay " + subTotal);
        }
        s1.close();
    }
}
