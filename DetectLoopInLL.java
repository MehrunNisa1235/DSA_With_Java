//check in Linked list is there detect any loop or not :- 
public class DetectLoopInLL
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
        //public static Node tail; 
        

        /*public void add(int data)
        {
            Node newNode = new Node(data);
            newNode.next=head; 
            head=newNode; 
        }*/
    public static boolean isCycle()
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next; 

            if(slow == fast)
            {
                return true; 
            }
        }
            return false; 
    }
    public static void main(String args[])
    {
        /*DetectLoopInLL ll =new DetectLoopInLL(); 
        ll.add(4);
        ll.add(5); 
        ll.add(8); 
        ll.add(10);
        ll.add(12); 
        ll.head.next.next.next.next=ll.head;*/
        //or

        head= new Node(1); 
        head.next=new Node(5); 
        head.next.next=new Node(8);
        head.next.next.next=new Node(10);
        head.next.next.next.next=head; 


        System.out.print(isCycle()); 
    }
}
