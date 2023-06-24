

public class FirstLetterOfString
{
    public static String firstAlphabet(String str)
    {
        String ans="";
        ans= ans + str.charAt(0);

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                ans = ans+str.charAt(i+1);
            }
        }
            return ans; 
    }
    public static void main(String args[])
    {
        String str="Hello I Am Mehar";
        System.out.println(firstAlphabet(str)); 

    }
}
