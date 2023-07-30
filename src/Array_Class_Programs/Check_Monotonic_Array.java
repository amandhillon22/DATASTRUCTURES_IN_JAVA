
package Array_Class_Programs;


public class Check_Monotonic_Array {
    public static void main(String[] args) 
    {
       int a[]={5,4,3,2,7};
        System.out.println("Monotonic: "+ isMonotonic(a));
    }
    
    static boolean isMonotonic(int a[])
    {
        boolean ans1= isAsc(a);
        System.out.println("Ans1: "+ ans1);
        
        boolean ans2= isDesc(a);
        System.out.println("Ans2: "+ ans2);
        
        return (ans1||ans2);    
    }
    
    static boolean isAsc(int a[])
    {
        boolean ans1 =true;
        int N= a.length;
        
        for(int i=0; i<=N-2;i++)
        {
            ans1= ans1 && (a[i]<=a[i+1]); 
        }
        return ans1;
    }
    
      static boolean isDesc(int a[])
    {
        boolean ans2 =true;
        int N= a.length;
        
        for(int i=0; i<=N-2;i++)
        {
            ans2= ans2 && (a[i]>=a[i+1]); 
        }
        return ans2;
    }   
}
