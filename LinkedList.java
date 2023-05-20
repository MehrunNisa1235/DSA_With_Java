//Single Linkedlist Program add node in first and last and find the size of LinkedList:- 

public class LinkedList
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
       public static int size;

 
       //AddFirst 
       public void addFirst(int data)
       {
            //step1: create a new node 
            Node newNode=new Node(data);
            size++;
       
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

       //AddLast 
       public void addLast(int data)
       {
            //step1: create a node
            Node newNode= new Node(data); 
            size++; 

            if(head == null)
            {
                head=tail=newNode;
                    return; 
            }
            
            //step2: newNode will be added after tail 
            tail.next=newNode;

            //newNode will become new tail
            tail=newNode;
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
        LinkedList ll = new LinkedList(); 
        ll.addFirst(2); 
        ll.addFirst(3);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        System.out.println("Size is : " +ll.size);
    }
}
