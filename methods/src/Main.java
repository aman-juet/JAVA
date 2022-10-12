public class Main {
    public static void main(String[] args) {
        String name="AMAN";
        int studmarks = 85;
        String studentgrade=gradecalc(studmarks);
        Displayd(name,studentgrade );
    }
    public static String gradecalc(int marks){
        String grade;

        if(marks>90 && marks<=100){
            grade = "A";
        }
        else if(marks>80 && marks<=90)
        {
            grade="B";
        }
        else {
            grade = "C";
        }
        return grade;
    }
    public static void Displayd(String name,String studentgrade){
        System.out.println("Student name:"+ name + " GRADES : "+ studentgrade);
    }

}