package string;
import java.util.Scanner;
//using compareTo()
public class palindrome {
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);
    System.out.println("Enter String :");
    String str=s.next();
    String str1="";
    for(int i=str.length()-1;i>=0;i--){
      str1=str1 + str.charAt(i);
    }
    if (str.compareTo(str1)==0){
        System.out.println("\n" + str + " is palindrome");
    }
    else{
        System.out.println("Not palindrome");}
    
    
    }
  
    
}
