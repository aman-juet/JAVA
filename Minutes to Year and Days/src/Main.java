import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value in minutes \n");
        long min = sc.nextLong();
        printYearsAndDays(min);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes>0){
            long years = minutes / 525600;
            long minutesRemaining = (minutes - (years * 525600));
            long daysRemaining = minutesRemaining / 1440;
            System.out.println (minutes + " min = " + years + " y and " +daysRemaining + " d");
        }
        else System.out.println("Invalid Value");
    }
}