
package Prime_Number_Programs;

import String_Programs.*;


public class Check_Prime_Method_3 {
    public static void main(String[] args) {
        int n=1;
        System.out.println(isPrime(n));
    }
    
    static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        else
        {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
        }
    }
}
