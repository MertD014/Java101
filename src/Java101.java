import java.util.Scanner; //imports

public class Java101 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        //1.std out
        System.out.print("Hello ");
        System.out.println("world!");
        
        //2.data types
        byte a=1; //2**8
        short b=2; //2**16
        int c=3; //2**32
        long d=4; //2**64

        boolean bb=true; //1

        float f=6.0f; //2**32  ---1.4x10**-45 , 3.4x10**38--- 6-7 decimal
        double db=7.0; //2**64 ---4.9x10**-324 , 1.8x10**308--- 15 decimal

        char ch='a'; //2**16

        String sS="abc";
        System.out.println(sS);

        //3.operators are same as C

        //4.std input
        Scanner inp= new Scanner(System.in);
        db = inp.nextDouble();
        System.out.println(db);
        inp.close();
    }
}
