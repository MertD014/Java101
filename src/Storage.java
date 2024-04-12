import java.util.Scanner;

public class Storage {
    public static void main(String[] args) {
        int storedGoods = 100;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the number of processes:");
        int processCount = s1.nextInt();
        for(int i=0;i<processCount;i++){
            System.out.print("Process " + i + ": " );
            String processType = s1.next();
            int processAmount = s1.nextInt();
            if(processType.equals("buy")){
                storedGoods+=processAmount;
            }
            if(processType.equals("sell")){
                storedGoods-=processAmount;
            }
        }
        System.out.println("You have " + storedGoods + " in storage.");
        s1.close();
    }
}
