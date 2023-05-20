import java.util.Scanner; 

// Make a function to Add two numbers and return Sum:-

public class Funtion_2 
{   

     public static int calculateSum(int a,int b)
     {
        int sum=a+b; 
         return sum; 
     }

    public static void main(String args[])
    {
        System.out.println("Enter the values : ");
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        
        int sum=calculateSum(a,b);
        System.out.println("Sum of the number is : " +sum);  
    }
}
    