import java.util.*;
public class StackCLF {
    
    public static void pushAtBottom(int data ,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
     if(s.isEmpty()){
         return;
     }
        int top=s.pop();   
     reverse(s);
     pushAtBottom(top, s);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<Integer>();
        s.push(89);
        s.push(262);
        s.push(272);
        s.push(824);
   
        pushAtBottom(786, s);
        System.out.println("Reverse of the String");
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop(); 
        }
    }
 
}
