 import java.util.Scanner; 
//program to find GCD(Greatest common divisor):- 
public class Gcd
{
    public static void  main(String args[])
    { 
         int g=0; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter first number ");
        int a=sc.nextInt();
 
        System.out.println("Enter second number ");
        int b=sc.nextInt();
        
        System.out.println("common divisor of the given number "+a+" and "+b+" is : "); 
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0 )
            {
                System.out.print(i +"\t");  
                 g=i;    
            }
            
        }
            System.out.println(" ");
        System.out.println("Greatest common divisor (GCD) is = " +g); 
        
    
        
        
    }
}
