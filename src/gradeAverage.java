/*
 * Finds the class average for N students.
 * Input:
 * First N then N integers representing grade of a student
 * Output:
 * Average of the given grades.
 */

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("N:");
        int n=s1.nextInt();
        System.out.print("Grades:");
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=s1.nextInt();
        }
        System.out.println("Grade average is " + sum/n);
    }
}
