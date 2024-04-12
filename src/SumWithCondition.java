import java.util.Scanner;

public class SumWithCondition {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int x=0;
        int sum=0;
        do{
            x=s1.nextInt();
            if(x%4==0) sum+=x;
        }while(x%2==0);

        System.out.println("Sum of multiples of 4: " + sum);
        s1.close();
    }
}
