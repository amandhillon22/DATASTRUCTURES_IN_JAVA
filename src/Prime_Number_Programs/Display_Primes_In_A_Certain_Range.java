
package Prime_Number_Programs;

import String_Programs.*;


public class Display_Primes_In_A_Certain_Range {
    public static void main(String[] args) {
        int L=80;
        int U=100;
        
        displayPrimes(L,U);
    }
    
    static void displayPrimes(int L, int U)
    {
        for(int i=L;i<=U;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    
    static boolean isPrime(int n)
    {
        if(n<=0)
            return false;
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
}
