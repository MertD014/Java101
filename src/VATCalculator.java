import java.util.Scanner;

public class VATCalculator {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the price before VAT:");
        double basePrice=s1.nextDouble();
        System.out.print("Enter the VAT %:");
        double vatPercentage=s1.nextDouble();
        double finalPrice = basePrice*(100+vatPercentage)/100;
        System.out.print("Final price is :" + finalPrice);
        s1.close();
    }
}
