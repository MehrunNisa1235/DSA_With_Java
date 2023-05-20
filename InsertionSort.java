
import java.util.*; 
public class InsertionSort
{

    public static void printArray(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] +" "); 
        }
        System.out.println(); 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the no of elements");
            int n=sc.nextInt();

        int a[]=new int[n]; 
        System.out.println("Enter the Array Elements"); 
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt(); 
        }

        //InsertionSort
        for(int i=0;i<n;i++)
        {
            int key=a[i]; 
            int j=i-1; 
            while(j>=0 && key < a[j])
            {
                a[j+1]=a[j]; 
                j--; 
            }
            a[j+1]=key; 
        }

        printArray(a,n); 

    }
}
