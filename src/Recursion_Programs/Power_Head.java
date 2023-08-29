
package Recursion_Programs;


public class Power_Head {
    public static void main(String[] args) {
//        power(5,3);
        System.out.println(power(5,3));
    }
    
    static int power(int m, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return m*power(m,n-1);
        }
    }
}
