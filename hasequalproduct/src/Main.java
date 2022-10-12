import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 no.s");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean res = hasequalprod(a, b, c);
        System.out.println("Its "+ res + " that a*b=c");
    }
    public static boolean hasequalprod(int a, int b, int c){
        if((a*b)==c){
            return true;
        }
        else {
            return false;
        }
    }
}