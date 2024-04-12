public class FasrPow {
    public static void main(String[] args) {
        double base=1.4142; //sqrt(2)
        int power=4;  
        double ans=1;
        
        if(power==0) ans=1;
        else if(power==1) ans=base;
        else{
            while(power>1){
                if(power%2==0){
                    base=base*base;
                    power/=2;
                }
                else{
                    ans*=base;
                    power--;
                }
            }
            ans*=base;
        }
        System.out.println("Ans:" + ans);
    }
}
