import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for Palindrome no\n");
        System.out.println("Enter a no");
        int n=sc.nextInt();
        boolean res = isPalindrome(n);
        System.out.println(res);
    }
    public static boolean isPalindrome(int n){
        int temp =0, rem,temp1;
        temp1=n;
        while(n!=0){
            rem = n%10;
            temp = temp*10+rem;
            n=n/10;
        }
        if(temp1==temp)
        {
            return true;
        } else   {
            return false;
        }
    }
}