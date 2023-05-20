
import java.util.Arrays;
import java.util.Collections; 

public class ShortcutSorting
{
    public static void main(String args[])
    {
        //Integer  arr[]={30,20,13,40,11}; 

        String arr[]={"mehar","alisha","aj"}; 
        Arrays.sort(arr);

        //print sorted array in ascending order
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" "); 
        }
       // print without using loop :=   System.out.println("array element " +Arrays.toString(arr)); 

        System.out.println();

        //array sort in decending order 

        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" "); 
        }
    
        //System.out.println("array element " +Arrays.toString(arr));
        
    }
}
