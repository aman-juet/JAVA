public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        perfect(28);
    }
    public static void perfect(int n){
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                s+=i;
            }}
            if(s==n){
                System.out.println("PERFECT No.");
            }
            else System.out.println("NOT AN PERFECT NO.");
        }

}