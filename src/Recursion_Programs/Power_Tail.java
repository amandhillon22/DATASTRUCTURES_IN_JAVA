
package Recursion_Programs;


public class Power_Tail {
    public static void main(String[] args) {
        power(5,3,1);
    }
    
    static void power(int m, int n, int ans)
    {
        if(n==0)
        {
            System.out.println(ans);
        }
        else
        {
            ans=ans*m;
            power(m,n-1,ans);
        }
    }
}
