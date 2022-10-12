import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length, breadth & Hieght respc.");
        int l = sc.nextInt();
        int b  = sc.nextInt();
        double h= sc.nextDouble();

        double sq_area = area(l);
        double rect_area = area(l,b);
        double tri_area = area(b,h);
        System.out.println("Area of Square : " + sq_area);
        System.out.println("Area of Square : " + rect_area);
        System.out.println("Area of Square : " + tri_area);
    }
    public static double area(int l){
        double a;
        a=l*l;
        return a;
    }
    public static double area(int l, int b){
        double a;
        a=l*b;
        return a;
    }
    public static double area(int b, double h){
        double a = 0.5*b*h;
        return a;
    }


}