public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
this.data=data;
this.next=null;
size++;

        }
    }
    //add -first,last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null ){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
            
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next=newNode;

    }
    //delete-first
    public void deletefirst(){
        
        if(head==null){
           System.out.println("Underflow Condition");
        }

        head=head.next;
size--;

    }
    //delete-last
    public void deletelast(){
        
        if(head==null){
           System.out.println("Underflow Condition");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node currNode=head.next;
        while(currNode.next!=null){
            currNode = currNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;



    }
    public int getsize(){
        return size;
    }
    //print
    public void printList(){
        if(head==null){
           System.out.println("Underflow condition");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }
    public static void main(String args[]){
    LL list=new LL();
      list.addFirst("name");
      list.addFirst("My");
      list.printList();
      list.addLast("is Vidushi");
      list.printList();
      list.deletefirst();
      list.printList();
      list.deletelast();
      list.printList();
      list.getsize();
    }
}
