import java.util.Scanner;

class Stack
{
static Scanner s=new Scanner(System.in);
static int stack[], top=-1, size;

static 
{
 Stack.create();
}
public static void main(String[] args){
int ch,item;
while(true)
{
System.out.println("1.Push");
System.out.println("2.Pop");
System.out.println("3.Display");
System.out.println("4.Quit");

System.out.print("Enter your choice");
ch=Stack.s.nextInt();

switch(ch)
{
case 1: System.out.println("Enter element");
        item=s.nextInt();
        Stack.push(item);
        break;
case 2: item=pop();
        if(item==0){
        System.out.println("Underflow");}
        else{
            System.out.print(item);}
        
        break;
case 3: display();
        break;
case 4:System.exit(1);

}
}
}
static void create(){

System.out.println("Enter size");
size=s.nextInt();
stack=new int[size];
System.out.println("Stack created");
}

static void push(int item){
 if(isFull())
 {
    System.out.println("Overflow");
 }
 else{
   
    stack[++top]=item;
 }
}
 static boolean isFull(){
   if(top==size-1){
   return true;
   }
   else {
   return false;}
 }
 static int pop(){
  if(isempty())
  {
    return 0;
  }
  else{
  return stack[top--];
  }
 }
 static boolean isempty()
 {
 if(top==-1){
 return true;
 }
 else{
 return false;
 }
 }
 static void display(){
    if(isempty())
    {
      System.out.println("underflow");
    }
    else{
        System.out.println("elements are");
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);}
    }
 }
}