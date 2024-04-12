import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        double perKm=0.10;
        
        Scanner s1 = new Scanner(System.in);
        System.out.print("Please enter your flight distance: ");
        double distance = s1.nextDouble();
        System.out.print("Please enter your age: ");
        int age = s1.nextInt();
        System.out.print("Choose your ticket type (1-single 2-round trip): ");
        int ticketType = s1.nextInt();
        
        double ageDiscountPercentage;
        if(age<12) ageDiscountPercentage=0.50;
        else if(age<24) ageDiscountPercentage=0.10;
        else if(age>65) ageDiscountPercentage=0.30;
        else ageDiscountPercentage=0;

        double roundTripDiscountPercentage;
        switch(ticketType){
            case 2:
                roundTripDiscountPercentage=0.20;
                break;
            default:
                roundTripDiscountPercentage=0;
        }

        System.out.println("Subtotal = " + distance*perKm);
        System.out.println("Discount = " + distance*perKm*(1-(1-ageDiscountPercentage)*(1-roundTripDiscountPercentage)));
        System.out.println("Total = " + distance*perKm*(1-ageDiscountPercentage)*(1-roundTripDiscountPercentage));
        
        s1.close();
    }
}
