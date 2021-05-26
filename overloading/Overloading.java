package overloading;

class Area {
    void area(int a){
    System.out.println("Area of square= " + (a*a));
    }
    
    void area(int a, int b){
        System.out.println("Area of rectangle= " + (a*b));
    }
}
 public class Overloading{
  public static void main(String args[]){
  Area obj=new Area();
  obj.area(12);
  obj.area(12,10);
 }
}
