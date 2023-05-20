
import java.util.ArrayList;
import java.util.Collections; 

public class SortingArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(12);
        list.add(20);
        list.add(30);
        list.add(10); 
        System.out.println(list);


        Collections.sort(list);
        System.out.print(list +" ");    //ascending order 
        System.out.println("  "); 


        Collections.sort(list, Collections.reverseOrder());     //descending order 
        System.out.print(list +" ");
    }
}
