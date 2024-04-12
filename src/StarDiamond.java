
public class StarDiamond {
    public static void main(String[] args) {
        int x=5;
        for(int i=1;i<=x;i+=2){
            System.out.print(" ".repeat(((x-i)/2)));
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(((x-i)/2)));
            System.out.println();
        }
        for(int i=x-2;i>=1;i-=2){
            System.out.print(" ".repeat(((x-i)/2)));
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(((x-i)/2)));
            System.out.println();
        }
    }
}
