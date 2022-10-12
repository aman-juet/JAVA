import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean res = hasNotTeen(a,b,c);
        System.out.println(res);
    }

    public static boolean hasNotTeen(int num1, int num2, int num3) {

        if (num1 >= 13 && num1 <= 19)
            return false;
        else if (num2 >= 13 && num2 <= 19)
            return false;
        else if (num3 >= 13 && num3 <= 19)
            return false;
        else
            return true;
    }
}