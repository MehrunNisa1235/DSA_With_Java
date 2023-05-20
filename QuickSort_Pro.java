import java.util.*; 
public class QuickSort_Pro
{
    public static void printArr(int a[])
    {
        //System.out.println("sorted element is  :");    
	    for(int i=0;i<a.length;i++) 
	    {
		  System.out.print(a[i]+" "); 
	    }
        System.out.println(); 
    }

    public static void quicksort(int a[],int first,int last)
   {
 	   int pivot,temp; 
 	   if(first<last)
 	   {
 	    pivot=first; 
	    int i=first; 
	    int j=last; 
	    while(i<j)
	    {
	        while(a[i]<=a[pivot] && i<last)
            {
                i++; 
            }
		            
		    while(a[j]>a[pivot])	
            {
                j--; 
            }
		
		    if(i<j)
		    {
			    temp=a[i];
			    a[i]=a[j];
			    a[j]=temp; 
		    } 
	  }	

	    temp=a[pivot];
	    a[pivot]=a[j];
	    a[j]=temp; 

	    quicksort(a,0,pivot-1);  // to sort left side element
	    quicksort(a,pivot+1,last); // to sort right side element
	}
    
 }
  
 public static void main(String args[])
{
	
    int a[]={2,10,4,6,9,8}; 
	quicksort(a,0,a.length-1);
    printArr(a); 

	
} 
}
