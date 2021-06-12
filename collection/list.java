package collection;
//simple program to create a list of 10 numbers
import java.util.ArrayList;
import java.util.List;

public class list {
   public static void main(String args[]){
     List<Integer> list=new ArrayList<Integer>();
     for (int i=1;i<10;i++){
     list.add(i);
     }
     for(Integer i:list)
     System.out.println(i);
   
   }
    
}
