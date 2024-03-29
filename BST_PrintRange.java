
//program to print the range in Binary Search Tree:-
public class BST_PrintRange
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
           
        }
    }
    public static Node insert(Node root , int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }

        if(root.data > val)
        {
            //insert in LeftSubTree
            root.left = insert(root.left , val);
        }
        else
        {
            //insert in RightSubtree
            root.right = insert(root.right , val); 
        }
            return root;
    }

    public static void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    public static void inRange(Node root , int k1 , int k2)
    {
        if(root == null)
        {
            return;
        }

        //case 1:
        if(root.data >= k1 && root.data<=k2)
        {
            inRange(root.left,k1,k2);
            System.out.print(root.data +" ");
            inRange(root.right,k1,k2);
        }
        //case 2:
        else if(root.data < k1)
        {
            inRange(root.left,k1,k2);
        }
        else
        {
            inRange(root.right,k1,k2);
        }
    }



    public static void main(String args[])
    {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<val.length;i++)
        {
            root = insert(root , val[i]);
        }

        inOrder(root);
        System.out.println();

        inRange(root,5,12);
        
    }
}
