

public class BST_SearchKey
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

    public static boolean search(Node root , int key)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == key)
        {
            return true;
        }

        if(root.data > key)
        {
            //go to left subtree
            return search(root.left , key);
        }
        else
        {
            //go to right subtree
            return search(root.right, key);
        }
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
        
    public static void main(String args[])
    {
        int val[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<val.length;i++)
        {
            root = insert(root , val[i]);
        }

        inOrder(root);
        System.out.println();

        
        if(search(root , 7))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
