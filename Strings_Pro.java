import java.util.*; 

public class Strings_Pro
{ 
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter any String : "); 
    String name=sc.nextLine();

    System.out.println("String is : " +name);  

    // find String length
    System.out.println("length of the String is " +name.length());  

    // charAt
    
    System.out.println("When we use charAt() then the String Result is : "); 
    for(int i=0;i<name.length();i++)
    {
        System.out.println(name.charAt(i)); 
    } 

    // convert into lowerCase:- 

    String str="Mehrun nisa";
    System.out.println(str.toLowerCase());
    
    // convert into UpperCase:- 

    System.out.println(str.toUpperCase());

    // Substring 

    System.out.println("Substring is : " +str.substring(0,6)); 
    
    // trim() used for beginning and ending spaces 
    System.out.println(str.trim() +"Alisha"); 

    // replace (Old char to new Char)

    String str2="Alisha";
    System.out.println(str2.replace('A','M'));  


    }  
    
}    
