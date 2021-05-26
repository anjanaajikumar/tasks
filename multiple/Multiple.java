package multiple;
interface A
{
 void show();

}
interface B
{
 void show1();
}

class C implements A,B
{
 public void show(){
   System.out.println("method of interface A");
 }
 public void show1(){
    System.out.println("method of interface B");
 }

}
public class Multiple {
    
    public static void main(String args[]){
     
     C obj=new C();
     obj.show();
     obj.show1();
    }
}
