//Stack implementation using Linked List:- 

import java.util.*; 
public class StackLL
{
    static class Node
    {
        int data; 
        Node next; 
        Node(int data)
        {
            this.data=data; 
            this.next=null; 
        }

    }
    static class Stack
    {
        static Node head=null; 

        //isEmpty or not
        public static boolean isEmpty()
        {
            return head==null; 
        }

        //Push 
        public static void push(int data)
        {
            Node newNode=new Node(data); 
            if(isEmpty())
            {
                head=newNode; 
                return; 
            }
            newNode.next=head; 
            head=newNode; 
        }

        //pop
        public static int pop()
        {
            if(isEmpty())
            {
                return -1; 
            }
            int top=head.data;
            head=head.next; 
                return top;  
        }

        //peek 
        public static int peek()
        {
            if(isEmpty())
            {
                return -1; 
            }
            return head.data; 
        }
        
    }

    public static void main(String args[])
    {
        Stack s=new Stack(); 
        s.push(40);
        s.push(50);
        s.push(70); 
        while(!s.isEmpty())
        {
            System.out.println(s.peek()); 
            s.pop(); 
        }
    }
}
