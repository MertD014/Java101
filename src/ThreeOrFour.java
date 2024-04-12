public class ThreeOrFour {
    
    public static void main(String[] args) {
        int limit=100;
        int sum=0;
        int count=0;

        for(int i=0;i<=limit;i++){
            if(i%3==0 || i%4==0){
                sum+=i;
                count++;
            }
        }
        if(count!=0) System.out.println("Average is " + Double.valueOf(sum)/count);
        else System.out.println("Division by 0!");
    }
}