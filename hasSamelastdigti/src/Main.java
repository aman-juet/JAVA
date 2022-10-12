public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(hasSameLastDigit(23,35,65));
    }
    public static boolean hasSameLastDigit(int n1,int n2,int n3){
        if((n1<10 || n1>1000) || (n2<10 || n2>1000) || (n3<10 || n3>1000)){
            return false;
        }
        else return ((n1 % 10 == n2 % 10) || (n1 % 10 == n3 % 10) || (n2 % 10 == n3% 10));
}}