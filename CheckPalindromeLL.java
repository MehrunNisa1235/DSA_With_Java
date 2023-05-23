//check the given Linked list is it palindrome or not:- 

public class CheckPalindromeLL
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

       //1:- find mid using Slow_Fast approach :- 
       public Node findMid(Node head)
       {
          Node slow=head; 
          Node fast=head; 

          while(fast!=null && fast.next!=null)
          {
                slow=slow.next; 
                fast=fast.next.next; 
          }
            return slow; // Now slow is our mid 

       }

       public boolean isPalindrome()
       {
            if(head == null || head.next == null)
            {
                return true; 
            }

            Node mid=findMid(head); 

            // 2 :- reverse the 2nd half 
            Node curr=mid; 
            Node prev=null; 
            Node next; 

            while(curr != null)
            {
                next=curr.next; 
                curr.next=prev; 
                prev=curr; 
                curr=next; 
            }
            Node right=prev; 
            Node left = head; 


            //3:- check 1st half and 2nd half is equal or not :-
            while(right != null)
            {
                if(left.data != right.data)
                {
                        return false; 
                }
                left = left.next; 
                right= right.next.next; 
            }
                return true; 
            
            
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
        CheckPalindromeLL ll = new CheckPalindromeLL(); 
        ll.addFirst(1); 
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        
        System.out.println(ll.isPalindrome()); 
    }
}
