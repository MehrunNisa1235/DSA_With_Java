
//Add Element in Middle 

public class Middle_LL
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

         //step2: newNode next = head
         newNode.next=head; 

         //step3: head=newNode
         head=newNode; 
    }


    public void addMiddle(int index,int data)
    {
        Node newNode=new Node(data);

        if(index==0)
        {
            addFirst(data); 
            return; 
        }
        
        Node temp=head;
        int i=0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;  

    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty ");
            return;
        }

        Node temp=head; 
        while(temp!=null)
        {
            System.out.print(temp.data +"->"); 
            temp=temp.next;
        }
        System.out.print("null"); 

    }


    public static void main(String args[])
    {
        Middle_LL ll = new Middle_LL();
        ll.addFirst(7); 
        ll.addFirst(8);
        ll.addFirst(10);
        ll.addFirst(15);
        ll.addMiddle(2,9);
        ll.print(); 
    }
}
