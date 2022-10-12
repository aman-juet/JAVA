import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number to find its table");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        tablecalc(n);
    }
    public static void tablecalc(int n){
        //using for loop
       // for(int i=0;i<=10;i++){
        //    System.out.println(n +" * " +  i + " = " + (n*i));

        //using while
        int i=0;
        while(i<=10){
            int table = i*n;
            System.out.println(n +" * " +  i + " = " + table);
            i++;
        }
    }
}