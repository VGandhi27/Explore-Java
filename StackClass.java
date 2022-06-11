//Stack Using Linked List
class StackClass {
private static class Node{
    int data;
    Node next;
 
    Node(int data){
    this.data = data;
    next=null;
    }
 }

 static class Stack{
    public static Node head = null;  
    public void push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static boolean isEmpty(){
        return head == null; 
  
}
    public static int pop() {
        if(isEmpty()){
             return -1;
        }
        Node top=head;
        head=head.next;
        return top.data;

    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        Node top = head;
        return top.data;
        }
    }

    public static void main(String args[]){
       Stack stack1=new Stack();
       System.out.println("Stack started");
       stack1.push(1);
       stack1.push(2);
       stack1.push(3);
       stack1.push(4);

       while(stack1.isEmpty() ){
           System.out.println(stack1.peek());
          stack1.pop();
       }
       
    }
}
