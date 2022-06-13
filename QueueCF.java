//Implementation of Queue with the help of collection framework
import java.util.*;
public class QueueCF {

      public static void main(String args[]){
           // Queue q=new Queue();
           Queue<Integer> q=new LinkedList<Integer>();
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
   