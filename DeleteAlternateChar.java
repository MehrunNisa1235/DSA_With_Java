Given a string S as input. Delete the characters at odd indices of the string.

Example 1:

Input: S = "Geeks"
Output: "Ges" 
Explanation: Deleted "e" at index 1
and "k" at index 3.


class Solution {
    static String delAlternate(String S) {
        // code here
        String str="";
        for(int i=0;i<S.length();i=i+2)
        {
            str = str+S.charAt(i); 
        }
            return str; 
    }
}
