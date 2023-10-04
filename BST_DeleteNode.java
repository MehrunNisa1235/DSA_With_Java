

public class BST_DeleteNode
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

    /*public static boolean search(Node root , int key)
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
    }*/

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

    public static Node delete(Node root,int val)
    {
        if(root.data < val)
        {
            root.right = delete(root.right , val);
        }
        else if(root.data > val)
        {
            root.left = delete(root.left , val);
        }
        else
        {
            //voila case
            //case 1: leaf node
            if(root.left == null && root.right == null)
            {
                return null;
            }

            //case 2 : single child
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }

            //case 3: two children
            
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                delete(root.right , IS.data);
                
        }
            return root;
    }

    public static Node findInorderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
            return root;
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

        root = delete(root , 1);
        System.out.println();

        inOrder(root);
    }
}
