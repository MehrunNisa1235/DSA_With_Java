Example 1:

Input: S1 = "Geeks" , S2 = "forGeeks"
Output: "skeeGrofskeeG" 
Explanation: Concatenating S1 and S2 to 
get "GeeksforGeeks" then reversing it to 
"skeeGrofskeeG".

// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        
        String con=S1+S2;
        String ans="";
        for(int i=con.length()-1;i>=0;i--)
        {
            ans=ans + con.charAt(i);
        }
            return ans;
    }
} 
