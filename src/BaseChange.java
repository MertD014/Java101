public class BaseChange {
    public static void main(String[] args) {
        //from base 10 to binary
        int n=123463;

        int[] arr = new int[32];

        for(int i=0;n!=0;i++){
            arr[31-i]=n%2;
            n/=2;
        }
        
        for(int i=0;i<32;i++){
            System.out.print(arr[i]);
        }

    }

}
