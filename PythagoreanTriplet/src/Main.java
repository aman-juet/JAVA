import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a b c respectively");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        triplesCheck(a,b,c);
    }
    public static void triplesCheck(int a, int b, int c){
        if((a*a)+(b*b)==(c*c)){
            System.out.println("Its a Pythagorean Triple");
        }
        else{
            System.out.println("Not a Pythagorean triple");
        }
    }
}