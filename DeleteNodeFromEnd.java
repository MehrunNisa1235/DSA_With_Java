
//Find Nth Node from End :- 

 

public class DeleteNodeFromEnd
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

       public void deleteNthNodeFromEnd(int n)
       {
            //calculate the size 
            size=0; 
            Node temp=head; 
            while(temp != null)
            {
                temp=temp.next; 
                size++; 
            }
            

            if(n==size)     //if delete the first node 
            {
                head=head.next; 
                    return; 
            }

            int i=1; 
            int isToFind=size-n;   
            Node prev=head; 
            while(i < isToFind)
            {
                prev=prev.next; 
                i++; 
            }

            prev.next=prev.next.next; 
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
        DeleteNodeFromEnd ll = new DeleteNodeFromEnd(); 
        ll.addFirst(2); 
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(8);
        ll.print();
        
        ll.deleteNthNodeFromEnd(2);
        ll.print(); 
    }
}
