
//Queue implementation using Two Stacks:-

import java.util.*; 
public class Queue_TwoStacks
{
    static class Queue
    {
        static Stack<Integer> s1 = new Stack<Integer>(); 
        static Stack<Integer> s2=new Stack<Integer>(); 

        //isEmpty
        public static boolean isEmpty()
        {
            return s1.isEmpty(); 
        }

        //add
        public static void add(int data)
        {
            //step1: 
            while(!s1.isEmpty())
            {
                s2.push(s1.pop()); 
            
            }

            //step2:- 
            s1.push(data); 

            //step3:- 
            while(!s2.isEmpty())
            {
                s1.push(s2.pop()); 
            }
                return; 

        }

        //remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty"); 
                    return -1; 
            }
                return s1.pop(); 
        }

        //peek 
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty"); 
                    return -1; 
            }
                return s1.peek(); 
        }
    }

    public static void main(String args[])
    {
        Queue q = new Queue(); 
        q.add(10);
        q.add(20);
        q.add(30); 

        while(!q.isEmpty())
        {
            System.out.println(q.peek()); 
                q.remove(); 
        }
    }
}
