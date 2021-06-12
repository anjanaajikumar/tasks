package collection;

import java.util.ArrayList;
import java.util.List;

public class list1 {

    public static void main(String args[]){
        String[] arr={"car", "truck", "cycle", "bike"};
        
        List<String> list=new ArrayList<String>();
        
        for(String vehicles:arr)
        list.add(vehicles);
        
        System.out.println("list: " +list );
      
      }
    
}
