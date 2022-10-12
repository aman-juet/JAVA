public class Main {
    public static void main(String[] args) {
        int res = sumFirstAndLastDigit(-10);

        System.out.println("SUM ="+ res);
    }
    public static int sumFirstAndLastDigit(int n) {
        if(n<0){
            return -1;
        }
        int l = 0, f = 0, s = 0;
        l = n % 10;
        while (n > 9) {
            f = n / 10;
            n=n/10;
        }
        s=f+l;
        return s;

    }

}