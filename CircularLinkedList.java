//Circular Linkedlist Program :- 

public class CircularLinkedList
{
   public static class Node
   {
       int data;
       Node next; 

       public Node(int data)
       {
          this.data=data;
       }
   }

       public static Node head;
       public static Node tail; 
       public static int size;

 
       //Add Node:- 
       public void add(int data)
       {
            //step1: create a new node 
            Node newNode=new Node(data);
            size++;
       
            if(head == null)
            {
                head=newNode;
                tail=newNode;
                newNode.next=head; 
            
            }
            else
            {
                tail.next=newNode; 
                tail=newNode;
                tail.next=head; 
            }

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
            newNode.next=head; 
       }

       public void deleteFirst() 
       {  

            if(head == null) 
            {  
                System.out.println("List is Empty "); 
            }  
            else
            {  
            //Checks whether contain only one element  
            //If not, head will point to next element in the list and tail will point to new head.  
                if(head != tail )
                {  
                    head = head.next;  
                    tail.next = head;  
                }  
       
            }
        } 
       public void print()
       {
            Node current=head;   //create a temporary node
            if(head==null)
            {
                System.out.print("LinkedList is empty "); 
                  return;
            }
            do
            {
                System.out.print(" " +current.data); 
                current=current.next; 
            } while(current !=head);
                System.out.println(); 
            
        }  
           
       
       


    public static void main(String args[])
    {
        CircularLinkedList cll = new CircularLinkedList(); 
        cll.add(2); 
        cll.add(3);
        cll.add(6); 
        cll.print(); 
        System.out.println("Size is : " +cll.size);
        
        cll.addLast(5);
        cll.addLast(6);
        cll.print();
        System.out.println("Size is : " +cll.size);

        cll.deleteFirst();
        cll.print(); 

        
        
    }
}
