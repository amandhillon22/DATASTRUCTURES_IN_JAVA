
package Recursion_Programs;


public class Sum_of_10_digits {
    public static void main(String[] args) {
        sum(1,0);
    }
    
    static void sum(int n, int ans)
    {
        if(n==10)
        {
            ans= ans+ n;
            System.out.println(ans);
        }
        else
        {
            sum(n+1, ans+n);
        }
    }

}
