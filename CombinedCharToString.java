Example 1:

Input:
N = 13
Char array = g e e k s f o r g e e k s
Output: geeksforgeeks 
Explanation: combined all the characters
to form a single string.


class Solution{
    public String chartostr(char arr[], int N){
        
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            ans = ans+arr[i]; 
        }
            return ans; 
    }
}
