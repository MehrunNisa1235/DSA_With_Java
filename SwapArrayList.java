
import java.util.ArrayList;
//import java.util.Collections; 


public class SwapArrayList
{
    public static void swapTwoNumber(ArrayList<Integer> list,int indx1,int indx2 )
    {
        int temp = list.get(indx1);
        list.set(indx1 , list.get(indx2));   
        list.set(indx2 , temp); 
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(12);
        list.add(20);
        list.add(30);
        list.add(10); 
        System.out.println(list);

        int indx1 = 1;
        int indx2 = 3; 

        swapTwoNumber(list,indx1,indx2);
        System.out.println(list +" ");
    }
}
