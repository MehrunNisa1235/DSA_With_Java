
//Queue implementation using java Collection Framework(JCF)

import java.util.*; 
public class Queue_JCF 
{
    public static void main(String args[])
    {
        Queue<Integer> q = new ArrayDeque<>();   
        //Queue<Integer> q = new LinkedList<>(); 
        
        q.add(4);
        q.add(7); 
        q.add(9); 

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
                q.remove(); 
        }
    }
}
