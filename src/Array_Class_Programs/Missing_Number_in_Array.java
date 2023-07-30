
package Array_Class_Programs;



public class Missing_Number_in_Array {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6,7,8,9,10};
        int N= 10;
        
        System.out.println(missingNum(a,N));
    }
    
    static int missingNum(int a[], int N)
    {
        int expected_Sum= N*(N+1)/2;
        System.out.println("Expected Sum= "+ expected_Sum);
        int real_sum=0;
        
        for(int i=0;i<a.length;i++)
        {
            real_sum=real_sum + a[i];
        }
        System.out.println("RealSum= " + real_sum);
        
        return expected_Sum-real_sum;
    }
    
}
