
//find the diagonal sum:-

public class DiagonalSum
{
    public static int diagonalSum(int matrix[][])
    {
        //int sum=0;                                    //time complexity=0(n^2) 
        
       /* for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                //for primary Diagonal sum
                if(i == j)
                {
                    sum=sum+matrix[i][j];
                }

                //for secondary diagonal sum

                else if(i+j == matrix.length-1)
                {
                    sum=sum+matrix[i][j]; 
                }
            }
        } */

        int sum=0;                                  //time complexity = O(n)
        for(int i=0;i<matrix.length;i++)
        {
            //for primary diagonal 
                sum=sum+matrix[i][i];
            //for secondary diagonal
                if(i != matrix.length-1-i)
                {
                    sum = sum + matrix[i][matrix.length-i-1]; 
                }
        }

            return sum; 
    }
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
        System.out.println(diagonalSum(matrix)); 
    }
}
