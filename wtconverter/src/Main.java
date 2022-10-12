import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in kgs");
        double wtkg = sc.nextDouble();
        convert(wtkg);
    }
    public static void convert(double wt){
        double wtgms;
        double wtmgs;

        wtgms = wt*1000;
        wtmgs = wtgms*1000;
        System.out.println("Wt in Grams " + wtgms);
        System.out.println("Wt in MILIGrams " + wtmgs);
    }
}