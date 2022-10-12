import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size in KBs");
        double kb = sc.nextDouble();
        convert(kb);
    }
    public static void convert(double size){
        int mb;
        mb = (int)size/1024;
        double mbk = size%1024;
        System.out.println("Size : " + mb  + " MB and " + mbk + " kb");
    }

}