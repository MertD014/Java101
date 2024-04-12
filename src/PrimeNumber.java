public class PrimeNumber {
    public static void main(String[] args) {
        int x=48;
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
