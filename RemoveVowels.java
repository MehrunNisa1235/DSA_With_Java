Given a string, remove the vowels from the string.

Example 1:

Input: S = "welcome to geeksforgeeks"
Output: wlcm t gksfrgks
Explanation: Ignore vowels and print other
characters 



class Solution {
    String removeVowels(String S) {
        // code here
         return S.replaceAll("[aeiouAEIOU]", ""); 
    }
}

  
