package collection;

import java.util.HashSet;
import java.util.Set;

public class set {
   public static void main(String args[]){
   
      Set <Integer> s1=new HashSet<Integer>();
      Set <Integer> s2=new HashSet<Integer>();
      for(int i=2; i<=15;i=i+2){
        s1.add(i);
      }
      for(int i=1; i<=15;i++){
        s2.add(i);
      }
   
   //union
   
    Set <Integer> union=new HashSet<Integer>(s1);
    union.addAll(s2);
    System.out.println("union: " +union);
    
    
    //intersection
    Set <Integer> intersection=new HashSet<Integer>(s1);
    intersection.retainAll(s2);
    System.out.println("intersection: " +intersection);
    
    //difference
    
    Set <Integer> diff=new HashSet<Integer>(s2);
    diff.removeAll(s1);
    System.out.println("difference [set2-set1]: " +diff);
   }
    
}
