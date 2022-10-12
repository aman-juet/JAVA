public class Main {
    public static void main(String[] args) {
        int res = sumEven(10,10);
        System.out.println(res);
    }

    public static boolean isEven(int number){
        if(number>0){
            if(number%2==0){
                return true;
            } }
        return false;
    }

    public static int sumEven(int start, int end) {
        int sum = 0;
        if (end >= start || start > 0) {
            for (int i = start; i <= end; i++) {
                if (isEven(i)) {
                    sum += i;
                }
            }
            return -1;
        }
        return sum;

    }
}