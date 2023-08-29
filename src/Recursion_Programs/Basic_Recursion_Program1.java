
package Recursion_Programs;


public class Basic_Recursion_Program1 {
    public static void main(String[] args) {
        int n=3;
        print(n);
    }
    
   static void print( int n)
    {
        if(n==0)
        {
            
        }
        else
        {
//            System.out.println(n);
//            print(n-1);
            
            
            print(n-1);
            System.out.println(n);
        }
    }
}
