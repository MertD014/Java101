import java.util.Scanner;
public class PieceOfCake {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter radius(r):");
        double radius=s1.nextDouble();
        System.out.print("Enter angle(a):");
        double angle=s1.nextDouble();
        System.out.println("Area of your slice is " + (3.14*radius*radius*angle/360));
        s1.close();
    }
}
