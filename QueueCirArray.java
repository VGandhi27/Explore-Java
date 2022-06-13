//Implementation of circular Queue with the help of Array 
public class QueueCirArray {
    static class Queue{
        static int arr[];
        static int size;
        static int front=-1;
        static int rear=-1;
        Queue(int size){
            arr=new int[size];
            this.size=size;
         }
         
         //Is Empty condition
         public static boolean isEmpty(){
             return rear==-1 && front==-1;
         }

         //Is full Condition
         public static boolean isFull(){
             return (rear+1)%size==front;
         }

         //enqueue
         public static void add(int data){
             if(isFull()){
                System.out.println("OverFlow condition");
                return; 
             }
             if(front==-1){
                 front=0;
             }
             rear=(rear+1)%size;
             arr[rear]=data;

         }
         //dequeue
         public static int remove(){
           if(isEmpty()){
               System.out.println("Empty Queue");
               return -1;
           }    
           int result=arr[front];

           //If one element is present in Array
           if(rear==front)
           {
               rear=front=-1;
           }
           else{
               front =(front+1)%size;
           }
           
           return result;
           }
       //peek
       public static int peek(){
           if(isEmpty()){
               System.out.println("UnderFlow Condition");
               return -1;
           }    
           
           return arr[front];
           }
    }
   public static void main(String args[]){
         Queue q=new Queue(5);
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         System.out.println(q.remove());
         q.add(6);
         System.out.println(q.remove());
         q.add(7);
         while(!q.isEmpty()){
             System.out.println(q.peek());
             q.remove(); 
         }
   }
}
