public class Main {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int a,int b,int c){
        if(a>0 && b>0 && c>0){
            if(a==b && b==c && c==a)
            {
                System.out.println("All no.s are equal");
            }
            else if(a!=b && b!=c && c!=a){
                System.out.println("All no.s are diffrent");
            }
            else System.out.println("Niether all are equal or diffrent ");
        }
        else System.out.println("Invalid Value");
    }
}