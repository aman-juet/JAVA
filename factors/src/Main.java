public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORS \n");
        factor(32);
    }
    public static void factor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }
    }
}