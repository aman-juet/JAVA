import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        JUET j = new JUET();
        j.t1();
    }
}
class University{
    boolean strangeThings = false;

    void exam(){
        if(strangeThings){
             throws new ExamSuspendException("Strange things occured");
        }
    }
}
class ExamSuspendException  extends Exception{
    public void printStackTrace(){
        System.out.println(getMessage());
        System.out.println("Exam Suspended");
    }

ExamSuspendException(String s) {
    super(s);
}}
class JUET{
    void t1(){
        University U = new University();
        U.exam();
    }
}
