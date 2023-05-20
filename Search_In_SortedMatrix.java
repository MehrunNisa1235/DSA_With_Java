
//program to find number in given sorted matrix :- 

public class Search_In_SortedMatrix
{
    public static boolean searchSortedMatrix(int matrix[][],int key)
    {
        int row=0;
        int col=matrix[0].length-1;

        while(row <= matrix.length-1 && col >= 0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("Element found at index ("+row+" , "+col+") "); 
                    return true; 
            }
            else if(key < matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
         System.out.println("Element not found "); 
                return false; 
    }

    public static void main(String args[])
    {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}}; 
        int key=39;
        searchSortedMatrix(matrix,key); 
    }
}
