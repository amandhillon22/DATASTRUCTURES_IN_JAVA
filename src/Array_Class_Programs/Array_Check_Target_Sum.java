
package Array_Class_Programs;

import java.util.*;

public class Array_Check_Target_Sum {
    public static void main(String[] args) {
        int a[]={2,4,6,5,7,8,3,40,65,43,21,11};
        int target= 120;
        System.out.println(twoSum(a,target));
    }
    
    static boolean twoSum(int a[], int target)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<a.length; i++)
        {
            hs.add(a[i]);
        }
        boolean found=false;
        
        for(int i=0; i<a.length;i++)
        {
            if(hs.contains(target-a[i]))
            {
                found=true;
                break;
            }
        }
        return found;
    }
    
}
