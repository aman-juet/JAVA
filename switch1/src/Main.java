import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char a = sc.next().charAt(0);
        switch (Character.toLowerCase(a)) {
            case 'a':
                System.out.println("Its an vowel");
                break;
            case 'e':
                System.out.println("Its an vowel");
                break;
            case 'i':
                System.out.println("Its an vowel");
                break;
            case 'o':
                System.out.println("Its an vowel");
                break;
            case 'u':
                System.out.println("Its an vowel");
                break;
            default:
                System.out.println("NOT A VOWEL");
        }
        }
    }
