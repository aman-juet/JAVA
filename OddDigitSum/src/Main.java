public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int res=getOddDigitSum(123456789);
        System.out.println(res);
    }
    public static int getOddDigitSum(int n){
        int s=0,rem=0;
        while(n!=0){
             rem=n%10;
            if(rem%2!=0){
                s=s+rem;
            }
            n=n/10;
        }
        return s;
    }
}