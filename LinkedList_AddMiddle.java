
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

    public static add(int data)
    {
        Node newNode = new Node(int data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode; 
    }

    public static addMiddle(int index,int data)
    {
        Node newNode=new Node(int data);
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

    public static void print(int data)
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
        ll.add(7);
        ll.add(8);
        ll.add(10);
        ll.add(15);
        ll.addMiddle(2,9);
        ll.print(); 
    }
}
