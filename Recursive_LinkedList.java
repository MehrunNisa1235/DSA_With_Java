//Search for a key in Linkedlist and return the position where it is found if it and not found return -1 Using Recursive Approach:- 

public class Recursive_LinkedList
{
   public static class Node
   {
       int data;
       Node next; 

       public Node(int data)
       {
          this.data=data;
          this.next=null; 
       }
   }

       public static Node head;
       public static Node tail; 
       

 
       //AddFirst 
       public void addFirst(int data)
       {
            //step1: create a new node 
            Node newNode=new Node(data);
       
            if(head == null)
            {
                head=tail=newNode;
                    return; 
            }

            //step2: newNode next = head;
            newNode.next=head; 

            //step3: head=newNode
            head=newNode; 
       }

       public int helper(Node head,int key)
       {
            if(head==null)
            {
                return -1;
            }
            if(head.data == key)
            {
                return 0; 
            }

            int index=helper(head.next,key);  //recursive call 

            if(index == -1)
            {
                return -1; 
            }
                return index+1; 


       }

       public int recSearch(int key)
       {
            return helper(head,key);
       }

       public void print()
       {
            if(head==null)
            {
                System.out.print("LinkedList is empty "); 
                  return;
            }

            Node temp=head;   //create a temporary node
            while(temp!=null)
            {
                System.out.print(temp.data +"->");
                temp=temp.next;
            }
            System.out.println("null"); 
       }
       


    public static void main(String args[])
    {
        Recursive_LinkedList ll = new Recursive_LinkedList(); 
        ll.addFirst(2); 
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(8);
        ll.addFirst(10);
        
        ll.print();
        System.out.println(ll.recSearch(5));
        System.out.println(ll.recSearch(12));
        
    }
}
