import java.util.Scanner;

public class CombinationPermutation {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String process;
        process = s1.next();
        int n = s1.nextInt();
        int r = s1.nextInt();
        int nf=1;
        int rf=1;
        switch (process) {
            case "F":
                for(int i=0;i<n;i++) nf*=(i+1);
                System.out.println("Factorial :" + nf);
                break;
            case "P":
                for(int i=n-r;i<n;i++) nf*=(i+1);
                System.out.println("Permutation :" + nf/rf);
                break;
            case "C":
                for(int i=n-r;i<n;i++) nf*=(i+1);
                for(int i=0;i<r;i++) rf*=(i+1);
                System.out.println("Combination :" + nf/rf);

                break;
            default:
                System.out.println("Invalid Operation!");
                break;
        }
        s1.close();
    }
}
