//Reverse the Linked List:- 

public class Reverse_LinkedList
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

       //reverse:- 
       public void reverse()
       {
            Node prev=null; 
            Node curr=tail=head;
            Node next;

            while(curr != null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next; 
            }
            head=prev; 
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
        Reverse_LinkedList ll = new Reverse_LinkedList(); 
        ll.addFirst(2); 
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(8);
        ll.addFirst(10);
        ll.print();
        
        ll.reverse();
        ll.print(); 
    }
}
