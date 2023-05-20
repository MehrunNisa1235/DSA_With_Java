
//print 1 to 5 number using recursion:- 

public class Recursion3
{

    //sum of natural number :- 
    
    public static void printSum(int i,int sum,int n)
    {
        if(n==1)
        {
            sum=sum+i; 
            System.out.println(sum); 
             return; 
        }
        

        sum=sum+i; 
        printSum(i+1,sum,n-1); 
    }

    


    public static void main(String args[])
    {
        printSum(1,0,5); 
    }
}