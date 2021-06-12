package collection;

import java.util.HashMap;
import java.util.Map;

public class map {
    
    public static void main(String args[]){
      Map<Integer,String> m=new HashMap<>();
      m.put(501,"Adarsh");
      m.put(502,"Adhi");
      m.put(503,"Adarsh");
      
      System.out.println(m.containsKey(504)); 
      System.out.println(m.size());
      System.out.println(m.get(502));
      
      System.out.println(m.entrySet()); //returns the entryset
      
      //printing using for loop
      for (Map.Entry e: m.entrySet()){
        System.out.println(e.getKey() + " " + e.getValue()); 
      }
      
      
      }
      
    }
    

