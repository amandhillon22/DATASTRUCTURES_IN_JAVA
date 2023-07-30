
package Array_Class_Programs;

import java.util.Arrays;


public class Running_Sum_LEETCODE_Q1480 {
    public static void main(String[] args) {
        int a[]={3,4,6,8,5,3};
        System.out.println(Arrays.toString(runningSum(a)));
    }
    
    public static int[] runningSum(int a[])
    {
        int b[]= new int[a.length];
        int sum=0;
        for(int i=0; i<a.length;i++)
        {
            sum= sum+ a[i];
            b[i]=sum;
        }
        return b;
    }
}
