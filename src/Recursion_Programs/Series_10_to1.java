
package Recursion_Programs;


public class Series_10_to1 {
    public static void main(String[] args) {
        print(10);
    }
    
    static void print(int n)
    {
        if(n==0)
        {
            
        }
        else
        {
            System.out.println(n);
            print(n-1);
        }
    }
}
