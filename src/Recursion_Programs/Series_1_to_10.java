
package Recursion_Programs;


public class Series_1_to_10 {
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
            print(n-1);
            System.out.println(n);
        }
    }
}
