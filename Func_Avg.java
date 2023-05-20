//Enter 3 number from the user and make a function to print Average :- 

import java.util.*;

public class Func_Avg
{

    public static int  printAverage(int a,int b,int c)
    {
        int average=(a+b+c)/3; 
          return average; 
    }
    public static void main(String args[])
    {
       System.out.println("Enter 3 Values : ");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt(); 
       int c=sc.nextInt(); 
       int average=printAverage(a,b,c);
       System.out.println("Total Average is : " +average); 


    }
}