
package Array_Class_Programs;


public class Nearest_Number_Divisible {
    public static void main(String[] args) 
    {
       int N= 40;
       int M=7;
      int result= nearest(N,M);
        System.out.println(N+"'s Nearest Number Divisible By "+ M +" is "+result);
    }
    
    static int nearest(int N, int M)
    {
        int plus, minus, i;
        
        for(i=0; ;i++)
        {
            if((N+i)%M==0)
            {
                plus=i;
                break;
            }
        }
        for(i=0; ;i++)
        {
            if((N-i)%M==0)
            {
                minus=i;
                break;
            }
        }
        if(plus>minus)
        {
            return (N-minus);
        }
        else
        {
            return (N+plus);
        }
    }
    
}
