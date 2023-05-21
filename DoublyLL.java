//Doubly Linked List program 

public class DoublyLL
{
    public static class Node
    {
        int data;
        Node next;
        Node prev; 

        public Node(int data)
        {
            this.data=data; 
            this.next=null;
            this.prev=null; 
        }
    }

    public static Node head; 
    public static Node tail;
    public static int size; 

    //add first
    public void addFirst(int data)
    {
        
        //create a new node 
        Node newNode = new Node(data); 
        size++; 

        if(head == null)
        {
            head=tail=newNode; 
                return; 
        }

        newNode.next=head; 
        head.prev=newNode; 
        head=newNode; 
    }

    //add last node :- 
    public void addLast(int data)
    {
        //create a new node :- 

        Node newNode =new Node(data); 
        size++; 
        if(head==null)
        {
            head=tail=newNode; 
            head.prev=null; 
            tail.next=null; 
             return; 
        }
        tail.next=newNode; 
        newNode.next=null; 
        newNode.prev=tail; 
        tail=newNode; 
    }

    //removeFirst node :- 

    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty "); 
                return Integer.MIN_VALUE; 
        }
        if(size == 1)
        {
            int val=head.data; 
            head=tail=null; 
            size--; 
            return val; 
        }

        int val=head.data; 
        head=head.next; 
        head.prev=null; 
        size--; 
            return val; 
    }

    public int removeLast()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty "); 
                return Integer.MIN_VALUE; 
        }

        if(size == 1)
        {
            int val=head.data; 
            head=tail=null; 
            size--; 
            return val; 
        }
        Node temp=head; 
        for(int i=0;i<size-2;i++)
        {
            temp=temp.next; 
        }

        int val=temp.next.data; 
        temp.next=null; 
        tail.prev=temp;
        tail=temp; 
        size--; 
        return val; 
    }

    

    public void print()
    {
        if(head == null)
        {
            System.out.println("Linked List is empty "); 
                return; 
        }
        Node temp=head; 
        while(temp!=null)
        {
            System.out.print(temp.data +"->"); 
                temp=temp.next; 
        }
        System.out.println("null"); 
    }

    public static void main(String args[])
    {
        DoublyLL dll = new DoublyLL(); 
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(8);
        dll.addFirst(9);
        dll.addFirst(10);
        dll.print(); 
        System.out.println("Size is : " +dll.size); 

        dll.addLast(12); 
        dll.print(); 
        System.out.println("Size is : " +dll.size); 

        dll.removeFirst(); 
        dll.print(); 
        System.out.println("Size is : " +dll.size); 

        dll.removeLast();
        dll.print();
        System.out.println("Size is : " +dll.size);  
        
    }
}
