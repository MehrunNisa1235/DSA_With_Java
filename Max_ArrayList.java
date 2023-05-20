
import java.util.ArrayList;
//import java.util.Collections; 


public class Max_ArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(12);
        list.add(20);
        list.add(30);
        list.add(10); 
        System.out.println(list);
        
        int max=Integer.MIN_VALUE; 
        /*for(int i=0;i<list.size();i++)
        {
            if(max < list.get(i))
            {
                max = list.get(i); 
            }
        }*/

        for(int i=0;i<list.size();i++)
        {
            max=Math.max(max, list.get(i)); 
        }

        System.out.println("Maximum element is : " +max); 

        //reverse an arrayList 

        for(int i=list.size()-1; i>=0; i--)
        {
            System.out.print(list.get(i) +" "); 
        }
    }
    
}
