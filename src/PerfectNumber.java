public class PerfectNumber {
    public static void main(String[] args) {
        int n=496;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) sum+=i;
        }
        System.out.println((sum==2*n)?"Perfect":"Not Perfect");
    }   
}
