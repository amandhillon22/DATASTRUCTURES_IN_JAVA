
package Prime_Number_Programs;

import String_Programs.*;


public class Display_Twin_Prime_Numbers {
    public static void main(String[] args) {
        int L=10;
        int U=20;
        
        displayTwinPrimes(L,U);
    }
    
    static void displayTwinPrimes(int l, int u)
    {
        for(int i=l;i<=u-2;i++)
        {
            if(isPrime(i)&&isPrime(i+2))
            {
                System.out.println(i + " -- " + (i+2));
            }
        }
    }
    
    static boolean isPrime(int n)
    {
        int flag=0;
        
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        return flag != 1;
    }
}
