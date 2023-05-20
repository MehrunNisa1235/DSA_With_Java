
public class FindOccurrance_Recursion
{
    public static int first=-1; 
    public static int last=-1; 

    public static void occurance(String str,int indx, char element)
    {
        if(indx == str.length())
        {
            System.out.println(first);
            System.out.println(last); 
		return; 
        }

        char currentChar=str.charAt(indx); 
        if(currentChar == element)
        {
            if(first==-1)
            {
                first=indx; 
            }
            else
            {
                last=indx; 
            }
        }
         occurance(str,indx+1,element); 
    }


    public static void main(String args[])
    {
        String str="abcaaaadagah"; //a start with 0 index and end with index 10
        occurance(str,0,'a');
    }
}
