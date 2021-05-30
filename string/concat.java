package string;

import java.util.Scanner;

public class concat {
    public static void main(String arg[]){
      String str,str1;
      Scanner s=new Scanner(System.in);
      System.out.println("First String :");
      str=s.next();
      System.out.println("Second String :");
      str1=s.next();
      System.out.println(str.concat(str1));
      
    }
}
