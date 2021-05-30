package overriding;

class Parent{
    void display(){
      System.out.println("Parent");
    }

}


class Child extends Parent{

    void display(){
        System.out.println("Child");
    
    }
}


public class Overriding {
    public static void main(String arg[]){
      Child c= new Child();
      c.display();
    
    }
}
