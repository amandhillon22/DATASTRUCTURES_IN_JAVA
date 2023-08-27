
package Prime_Number_Programs;

import String_Programs.*;
import java.util.*;
public class Prime_Numbers_Kehra_Number_Kinwa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int pos= getPrimePosition(n);
        
        if(pos>0)
            System.out.println("Position of "+n+" is: "+ getPrimePosition(n));
        else
            System.out.println("Enter a Prime Number");
    }
    
    static int getPrimePosition(int n)
    {
        if(isPrime(n))
        {
            int pos=0;
            
            for(int i=2;i<=n;i++)
            {
                if(isPrime(i))
                    pos++;
            }
            return pos;
        }
        return -1;
    }
    
    static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        
        return true;
    }
}
