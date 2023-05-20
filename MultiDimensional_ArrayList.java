

import java.util.ArrayList;
import java.util.Collections; 

public class MultiDimensional_ArrayList
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); 

        ArrayList<Integer> list1 = new ArrayList<>(); 
        list1.add(10);
        list1.add(20);
        list1.add(30);
        mainList.add(list1); 


        ArrayList<Integer> list2= new ArrayList<>(); 
        list2.add(1);
        list2.add(2);
        list2.add(3);
        mainList.add(list2);  

        System.out.println(mainList +" "); 

        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer> currentList= mainList.get(i); 
            for(int j=0;j<currentList.size();j++)
            {
                System.out.print(currentList.get(j) +" "); 
            }
        }

        
    }
}
