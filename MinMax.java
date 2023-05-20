
import java.util.*; 
public class MinMax
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number of elements");
            int n=sc.nextInt();

        
        System.out.println("Enter the elements"); 
        int a[]=new int[n]; 
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt(); 
        }

       printMinMAx(a,n); 
        
    }

   
    public static void  printMinMax(int a[],int n)  
    {
        
         // for minimum 
        int min = a[0] ;
        for(int i = 1; i < n; i ++)
        {
            if(min > a[i])
            {
                min = a[i];
            }
        }
        System.out.println("min = " +min); 

        // for maximum 
        int max = a[0] ;
        for(int i = 1; i < n; i ++) 
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }

        System.out.println("max = " +max); 
        
    }

}

