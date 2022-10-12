public class Main {
    public static void main(String[] args) {

        boolean p= ShouldWakeUp(true,23);
        System.out.println(p);
    }

    public static boolean ShouldWakeUp(boolean bark, int hr){

        if((hr>=1) && (hr<=23)){
        if( (bark== true) && (hr<8 || hr>22)){
            return true;
        }
        else {
            return false;
        }
    }
     else{
         return false;
        }
    }
}