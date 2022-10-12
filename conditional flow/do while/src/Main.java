//sum of digits

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number to find its sum of digits");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int rem;
        int sum=0;

        do {
            rem = n%10;
            sum = sum+rem;
            n/=10;

        } while(n!=0);

        System.out.println("SUM " + sum);

    }
}