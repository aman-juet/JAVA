import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of month\n");
        String m= sc.nextLine();
        System.out.println("Enter year\n");
        int yr = sc.nextInt();
        func1(m,yr);
    }
    public static void func1(String m, int yr){
        switch(m)
        {
            case "january":
            case "march":
            case "may":
            case "august":
            case "october":
            case "december":
            case "july":
                System.out.println("31 days");
                break;

            case "feburary":
                if(yr%4==0)
                {
                    System.out.println("29 Days");
                }
                else System.out.println("28 days");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 days");
                break;
            default:
                System.out.println("Wrong Spelling");
        }
    }
}