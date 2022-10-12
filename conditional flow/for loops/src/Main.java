//A prime number is a number which is divisible by 1 and itself.
//Print Prime numbers from 1 to n

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = sc.nextInt();
        int i;
        for(i=0;i<=n;i++){
            prime(i);
        }
    }
    public static void prime(int i){
        int count=0;
        for(int j=1;j<100;j++)
        {
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(i + "  is a Prime No.");
        }


    }
}