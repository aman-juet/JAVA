public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        bigCount *= 5;
        if(bigCount>goal && smallCount<goal)
            return false;
        if(bigCount+smallCount >= goal){
            return true;
        }
        else  return false;
    }
}