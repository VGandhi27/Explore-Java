import java.util.*;

public class TowerofHanoi {

    public static void towerofhanoi(int n,String src,String helper,String destination){
        if(n==1)
        {
             System.out.println(" Transfer disk " +n+" from "+src+" to "+destination);
             return;
        }
        towerofhanoi(n-1, src, destination, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+destination);
        towerofhanoi(n-1, helper, src, destination);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        towerofhanoi(n,"S", "H", "D");
         
    }
}