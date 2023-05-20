import java.util.Scanner; 

// print name using function:- 

public class Function_1
{
    
    public static void printMyName(String name)
    {
        System.out.println(name);
            return; 
    }
    
    
    public static void main(String args[])
    {
        System.out.println("plzz Enter your name : ");
        Scanner sc=new Scanner(System.in); 
        String name=sc.next(); 
        printMyName(name);         //function call 
    }
}