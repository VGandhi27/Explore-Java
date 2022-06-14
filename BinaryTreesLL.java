import java.util.*;
public class BinaryTreesLL {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
           }
        }
        static class BinaryTree{
            static int idx=-1;

            public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
            }
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q=new LinkedList<Node>();
            q.add(root);
            q.add(null);
            while( !q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                       System.out.print(currNode.data+" ");
                       if(currNode.left!=null){
                           q.add(currNode.left);
                       }
                       if(currNode.right!=null){
                           q.add(currNode.right);
                       }
                }
            } 
           
        }
        public static int countOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftNodes=countOfNodes(root.left);
            int rightNodes=countOfNodes(root.right);

            return leftNodes + rightNodes +1;
        }
        public static int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftSum= sumOfNodes(root.left);
            int rightsum= sumOfNodes(root.right);

            return leftSum + rightsum +root.data ;
        }
        public static int heightOfTree(Node root){
            if(root==null){
                return 0;
            }
            int leftheight= heightOfTree(root.left);
            int rightheight= heightOfTree(root.right);
            
            if(leftheight>=rightheight){
                return leftheight+1;
            }else{
                return rightheight+1;
            }
            
        }
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int diam1= diameter(root.left);
            int diam2= diameter(root.right);
            int diam3=heightOfTree(root.left)+heightOfTree(root.right)+1;

            return Math.max(diam3 ,Math.max(diam2,diam1));
            
        }
        static class TreeInfo{
           int ht;
           int diam;
           TreeInfo(int ht,int diam){
               this.ht=ht;
               this.diam=diam;
           }
        }
        public static TreeInfo diameter2(Node root){
            if(root==null){
               return new TreeInfo(0, 0);
            }

            TreeInfo left= diameter2(root.left);
            TreeInfo right= diameter2(root.right);
            
            int myHeight=Math.max(left.ht, right.ht)+1;

            int diam1=left.diam;
            int diam2=right.diam;
            int diam3=left.ht+ right.ht+1;

            int mydiam=Math.max(Math.max(diam1, diam3), diam2);

            TreeInfo myInfo=new TreeInfo(myHeight,mydiam);
            return myInfo;
            
        } 
       
        
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        BinaryTree tree=new BinaryTree();

        Node root=tree.buildTree(nodes); 
        System.out.println(root.data);
        System.out.println("Preorder traversal");
        preorder(root);
        System.out.println("\nInorder traversal");
        inorder(root);
        System.out.println("\nPost order traversal");
        postorder(root);
        System.out.println("\nLevel order traversal");
        levelOrder(root);
        System.out.println("Count of Nodes:"+ countOfNodes(root));
        
        System.out.println("Sum of Nodes:"+ sumOfNodes(root));

        System.out.println("Height of Tree:"+ heightOfTree (root));

        System.out.println("Diameter of Tree:"+ diameter(root));

        System.out.println("Diameter of Tree with second Approach:"+ diameter2(root).diam);

    }

}
