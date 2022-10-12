public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("AREA :" + area(5.0));
        System.out.println("AREA :" + area(-1));
        System.out.println("AREA :" + area(5.0,4.0));
        System.out.println("AREA :" + area(-1.0,5.0));

    }
    public static double area(double radi){
        if(radi<0){
            return -1.0;
        }
        else return (3.14*radi*radi);
    }

    public static double area(double x, double y){
      if(x<0 || y<0){
          return -1.0;
      }
      else return (x*y);

    }
}
