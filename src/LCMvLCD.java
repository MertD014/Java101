public class LCMvLCD {
    public static void main(String[] args) {
        int n1=11;
        int n2=12;

        for(int i=n1;i>0;i--){
            if(n2%i==0 && n1%i==0){
                System.out.println("LCD is " + i);
                System.out.println("LCM is " + n1*n2/i);
                break;
            }
        }
    }
}
