
//Print x^n number in Stack:-

public class XPower
{

    
    public static int calPower(int x,int n)
    {
        if(n==0)
        {
            return 1; 
        }
        
        int Power=calPower(x,n-1); 
        int result= x * power; 
            return result; 
    }

    public static void main(String args[])
    {
        int x=2,n=4;  
        int ans=calPower(x,n); 
        System.out.println(ans); 
    }
}
