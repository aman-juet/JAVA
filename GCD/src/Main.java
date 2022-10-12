public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int res = gcd(81,153);
        System.out.println(res);
    }
    public static int gcd(int n1,int n2){
        int k,g=1;
        if(n1<10||n2<10){
            return -1;
        }
        if(n1>n2){
            k=n2;
        }
        else k=n1;

        for(int i=1;i<k;i++){
            if(n1%i==0 && n2%i==0){
               g=i;
            }
        }
        return g;
    }
}