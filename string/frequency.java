package string;
  //to find frequency of a character 
public class frequency {

  public static void main(String arg[]){
    String str="Hello Rose,how are you?";
    int count=0, i;
    for(i=0; i<=str.length()-1;i++){
      if (str.charAt(i)=='o'){
       count++;
      
      }
    }
    System.out.println("Frequency of 'o' is  " + count );
  
  }
    
}
