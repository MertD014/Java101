public class Fibonacci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34
        int x=8;
        int f1=0;
        int f2=1;
        int f3=1;
        if(x==1) System.out.println(0);
        else if(x==2) System.out.println(1);
        else if(x==3) System.out.println(1);
        else{
            for(int i=4;i<=x;i++){
                f1=f2;
                f2=f3;
                f3=f1+f2;
            }
            System.out.println(f3);
        }
    }
}
