import java.util.Scanner; 

// Make a function to Multiply two numbers and return Product:-

public class Function_3
{   

     public static int calculateProduct(int a,int b)
     {
          return a*b; 
     }

    public static void main(String args[])
    {
        System.out.println("Enter the values : ");
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        
       // int product=calculateProduct(a,b);
        System.out.println("product of the number is : " +calculateProduct(a,b));  
    }
}
    