Given a string, check if all its characters are the same or not.

Example 1:

Input:
s = "geeks"
Output: False
Explanation: The string contains different
character 'g', 'e', 'k' and 's'.




//User function Template for Java

class Sol
{
    Boolean check (String s)
    {
        // your code here  
        char element=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(element!=s.charAt(i))
            {
                return false;
            }
        }
            return true;
    }
}
