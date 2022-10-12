public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigits(9,99));
        System.out.println(hasSharedDigits(12,25));
        System.out.println(hasSharedDigits(34,45));
    }
    public static boolean hasSharedDigits(int n1,int n2){
        int left1,left2,right1,right2;
        if((n1<=9 || n1>=100) || (n2<=9 || n2>=100)){
            return false;
        }
        else{
        left1 = n1%10;
        right1 = n2%10;
        left2 = n1/10;
        right2 = n2/10;
        if(left1 == right1 || left1 == right2 || left2 == right1 || left2==right2){
        return true;
        }
        else return false;
    }}
}