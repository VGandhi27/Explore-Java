import java.util.*;

public class StackAL{
  static class Stack{
   static ArrayList<Integer> list =new ArrayList<Integer>();
     public static boolean isEmpty(){
         return list.size()==0;
     }
     //push
     public static void push(int data){
         list.add(data);

     }
     // pop operation
     public static int pop(){
         if(isEmpty())
         {
             return -1;
         }
         int top=list.get(list.size()-1);
         list.remove(list.size()-1);
         return top;
     }
     //peek operation
     public static int peek(){
        if(isEmpty())
        {
            return -1;
        }
        return list.get(list.size()-1);
   }
 }
    public static void main(String args[]){
     Stack s=new Stack();
     s.push(89);
     s.push(262);
     s.push(272);
     s.push(824);

     while(!s.isEmpty()){
         System.out.println(s.peek());
         s.pop(); 
     }
    }
}