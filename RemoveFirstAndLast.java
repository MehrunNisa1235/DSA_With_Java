public class RemoveFirstAndLast
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

       //remove first node:-
       public int removeFirst()
       {
            if(size==0)
            {
                System.out.println("Linked List is empty ");
                    return Integer.MIN_VALUE;
            }
            else if(size==1)
            {
                int val;
                val=head.data;
                head=tail=null;
                return val; 
            }
            int val;
            val=head.data;
            head=head.next;
            size--;
              return val;
       }

       //remove last node:- 
       public int removeLast()
       {
            if(size==0)
            {
                System.out.println("Linked List is empty ");
                    return Integer.MIN_VALUE;
            }
            else if(size==1)
            {
                int val;
                val=head.data;
                head=tail=null;
                    return val; 
            }

            //previous node=size-2
            Node prev=head; 
            for(int i=0;i<size-2;i++)
            {
                prev=prev.next; 
            }
            int val=prev.next.data;
            prev.next=null; 
            tail=prev;
            size--;
                return val; 
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
        RemoveFirstAndLast ll = new RemoveFirstAndLast(); 
        ll.addFirst(2); 
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();
        System.out.println("Size is : " +ll.size);
        ll.removeFirst();
        ll.print(); 
        System.out.println("Size is : " +ll.size);
        ll.removeLast();
        ll.print();
        System.out.println("Size is : " +ll.size);

    }
}
