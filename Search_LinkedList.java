//Search for a key in Linkedlist and return the position where it is found if it and not found return -1 using Iterative approach:- 

public class Search_LinkedList
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

       public static int searchKey(int key)
       {
            Node temp=head;
            int i=0;
            while(temp!=null)
            {
                if(temp.data == key )
                {
                    return i; 
                }
                temp=temp.next;
                i++; 
            }
                return -1; 
            
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
        Search_LinkedList ll = new Search_LinkedList(); 
        ll.addFirst(2); 
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(8);
        ll.addFirst(10);
        
        ll.print();
        System.out.println(searchKey(5));
        System.out.println(searchKey(12));
    }
}
