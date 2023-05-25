
//Linked List in Collection FrameWork:- 

import java.util.LinkedList; 
public class CollectionFrameWorkInLL
{
    public static void main(String args[])
    {
        //create linked list 
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addFirst(2);
        System.out.println(ll);     //2-5-6-7
        System.out.println("Size is " +ll.size());

        //remove
        ll.removeLast();
        ll.removeFirst(); 
        System.out.println(ll);
        System.out.println("Size is " +ll.size());
    }
    
}
