import java.util.Scanner;

class Queue
{
static Scanner s=new Scanner(System.in);
static int queue[], rear=0, front=0, size;

static 
{
 create();
}
public static void main(String[] args){
int ch,item;
while(true)
{
System.out.println("1.Enqueue ");
System.out.println("2.Dequeue");
System.out.println("3.Display");
System.out.println("4.Quit");

System.out.print("Enter your choice");
ch=Queue.s.nextInt();

switch(ch)
{
case 1: System.out.println("Enter element");
        item=s.nextInt();
        enqueue(item);
        break;
case 2: item=dequeue();
        if(item==0){
        System.out.println("Queue empty");}
        else{
            System.out.print(item + " is deleted\n");}
        
        break;
case 3: display();
        break;
case 4: System.out.println("exiting");
        System.exit(1);

}
}
}
static void create(){

System.out.println("Enter size");
size=s.nextInt();
queue=new int[size];
System.out.println("Queue created");
}

static void enqueue(int item){
 if(isFull())
 {
    System.out.println("Queue is full");
 }
 else{
   
    queue[rear]=item;
    rear++;
    System.out.println(item + " is inserted");
 }
}
 static boolean isFull(){
   if(rear==size){
   return true;
   }
   else {
   return false;}
 }
 static int dequeue(){
  if(isempty())
  {
    return 0;
  }
  else{
  int item=queue[front];
  
  for(int i=front;i<rear-1;i++)
  {
  queue[i]=queue[i+1];
  
  }
  rear--;
  return item;
  }
 }
 static boolean isempty()
 {
 if(front==rear){
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
        for(int i=front;i<rear;i++){
            System.out.println(queue[i]);}
    }
 }
}