
package Prime_Number_Programs;

import String_Programs.*;


public class Prime_Number_GoldBatch_Question {
    public static void main(String[] args) {
        int n=10;
        goldBatchSum(n);
    }
    
    static void goldBatchSum(int n)
    {
        if(n>2 && n%2==0)
        {
        for(int i=2;i<=n/2;i++)
        {
            if(isPrime(i)&&isPrime(n-i))
            {
                System.out.println(i + " + " + (n-i));
            }
        }
        }
        else
            System.out.println("Enter Number Greater Than 2 and Even Number");
    }
     static boolean isPrime(int n)
     {
         int count =0;
         for(int i=1;i<=n;i++)
         {
             if(n%i==0)
                 count++;
         }
         return count==2;
     }
}
