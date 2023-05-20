public class MergeSort_Pro
{
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" "); 
        }
        System.out.println(); 
    }

    public static void mergeSort(int arr[],int si,int ei)
    {
        if(si >= ei)
        {
            return; 
        }

        int mid= (si+ei)/2;     //mid=si(ei-si)/2
        mergeSort(arr,si,mid);  //for left part
        mergeSort(arr,mid+1,ei); //for right part
        merge(arr,si,mid,ei); 

    }

    public static void merge(int arr[],int si,int mid,int ei)
    {
        //suppose left part 0-3 and rightpart 4-6 then 6-0+1=7 index
        int temp[]=new int[ei-si+1]; 
        int i=si;   //iterator for left part
        int j=mid+1; //iterator for right part
        int k=0;

        while(i<=mid && j<=ei)
        {
            if(arr[i] < arr[j])
            {
                temp[k] =arr[i];
                i++; 
            }
            else
            {
                temp[k]=arr[j]; 
                j++; 
            }
                k++; 
        }

        //for leftOver element of 1st sorted part:-
        while(i<=mid)
        {
            temp[k++]=arr[i++]; 
        }

        //for rightOver element of 2st sorted  part:-
        while(j<=ei)
        {
            temp[k++]=arr[j++]; 
        }

        //copy temp array into original array 

        for(k=0, i=si; k<temp.length; k++,i++)
        {
            arr[i]=temp[k]; 
        }
    }


    public static void main(String args[])
    {
        int arr[]={6,9,12,2,5,10}; 
        mergeSort(arr,0, arr.length-1);
        printArr(arr); 
    }
}
