import java.util.Scanner;
public class WhatToDo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("What is the temperature? : ");
        double temperature= s1.nextDouble();
        if(temperature<5){
            System.out.println("You should go skiing!");
        }
        else if (temperature<15){
            System.out.println("You should go watch a movie!");
        }
        else if(temperature<25){
            System.out.println("You should go for a picnic!");
        }
        else{
            System.out.println("Good day to swim away!");
        } 
        s1.close();
    }
}
