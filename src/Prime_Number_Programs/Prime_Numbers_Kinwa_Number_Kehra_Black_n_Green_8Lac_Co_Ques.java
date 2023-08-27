
package Prime_Number_Programs;

import String_Programs.*;
import java.util.*;
public class Prime_Numbers_Kinwa_Number_Kehra_Black_n_Green_8Lac_Co_Ques {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(n+"th Prime Number is: " +getPrime(n));
    }
    
    static int getPrime(int n)
    {
        int count=0, i;
        for(i=2; ;i++)
        {
            if(isPrime(i))
                count++;
            if(count==n)
                break;
        }
        return i;
    }
    
    static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
                if(n%i==0)
                    return false;
        }
        return true;
    }
}
