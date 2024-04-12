public class DigitSum {
    public static void main(String[] args) {
        int x=1238247;
        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        System.out.println(sum);
    }
}
