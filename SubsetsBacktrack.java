public class SubsetsBacktrack
{
    public static void findSubsets(String str,String ans,int i)
    {
        if(i==str.length())
        {
            if(ans.length()== 0)
            {
                System.out.print("null"); 
            }
            else
            {
                System.out.println(ans); 
            }
               return;
        }

        //for Yes 
        findSubsets(str,ans+str.charAt(i),i+1);

        //for No
        findSubsets(str,ans,i+1); 
    }

    public static void main(String args[])
    {
        String str="abc"; 
        findSubsets(str,"",0);
    }
}
