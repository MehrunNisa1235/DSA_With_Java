import java.util.*; 
public class practise{
    public static void main(String args[]){

        int a[]=new int[20];
        System.out.println("Enter the size of an array ");
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(); 
        
        System.out.println("Enter the Array elements");
        for(int i=0;i<n;i++){
             a[i]=sc.nextInt(); 
        }

        System.out.println("Array elements is : ");
        {
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println(); 
        
    }
   }
