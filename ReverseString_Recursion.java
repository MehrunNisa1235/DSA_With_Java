public class ReverseString_Recursion
{
    public static void reverseString(int Str,int index)
    {
        if(index==0)
        {
            System.out.println(Str.charAt(index)); 
                return; 
        }
        System.out.println(Str.charAt(index)); 
        reverseString(Str,index-1); 
    }


    public static void main(String args[])
    {
           String Str="Mehrun";
           reverseString(Str,Str.length()-1); 
    }
}