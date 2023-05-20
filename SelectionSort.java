// Perform Selection Sort:-


public class SelectionSort
{

    public static void printArray(int arr[])
    { 
        System.out.println("After Selection sort the Sorted Element is  : "); 
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i] +" "); 
        }
        System.out.println(); 

    }


    public static void main(String args[])
    {
        int arr[]={10,2,6,12,17,9}; 

        // Selection sort
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j; 
                }
            }

            int temp = arr[smallest];
            arr[smallest] =arr[i];
                 arr[i]  = temp; 
        }

        printArray(arr); 
    }
}
