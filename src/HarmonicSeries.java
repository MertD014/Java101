import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        double sum = 0;

        for(int i=1;i<=n;i++){
            sum+=(1.0/i);
        }
        
        System.out.println(sum);
        s1.close();
    }
}
