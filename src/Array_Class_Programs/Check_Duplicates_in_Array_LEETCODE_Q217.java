
package Array_Class_Programs;

import java.util.*;


public class Check_Duplicates_in_Array_LEETCODE_Q217 {
    public static void main(String[] args) {
        int a[]={10,19,20,30,40,60,77};
        System.out.println(checkDuplicates(a));
    }
    
    static boolean checkDuplicates(int a[])
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:a)
        hs.add(i);
               
        if(hs.size()==a.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
}
