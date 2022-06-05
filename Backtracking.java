import java.util.*;
class Backtracking {
    
    public static void printPermutation(String str,String permute,int index){
      if(str.length() == 0){
          System.out.println(permute);
          return;
      }
        for(int i=0;i<str.length(); i++) {
            char currchar=str.charAt(i);
            String newStr= str.substring(0,i) + str.substring(i+1);
         
        printPermutation(newStr,permute + currchar, index+1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();
       
        System.out.println("The Permutations are:");
        printPermutation(str,"", 0);
    }
}
