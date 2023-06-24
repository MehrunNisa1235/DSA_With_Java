Input:
S = "geeks  for geeks"
Output: geeksforgeeks
Explanation: All the spaces have been 
removed.

//User function Template for Java
class Solution
{
   
    String modify(String S)
    {
        // your code here
        return S.replaceAll("\\s","");
    }
}
