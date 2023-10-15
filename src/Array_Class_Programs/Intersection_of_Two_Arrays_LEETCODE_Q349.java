
package Array_Class_Programs;

import java.util.*;


public class Intersection_of_Two_Arrays_LEETCODE_Q349 {
    public static void main(String[] args) {
           int a[]={10,20,33,30,40,50,50};
        int b[]={60,33,80,40,10,90,100};
        int c[]= intersection(a,b);
        System.out.println(Arrays.toString(c));
    }
    
    static int[] intersection(int a[], int b[])
    {
        ArrayList<Integer> al1= new ArrayList<>();
        for(int i:a)
            al1.add(i);
        
        ArrayList<Integer> al2= new ArrayList<>();
        for(int i:b)
            al2.add(i);
        
        al1.retainAll(al2);
        System.out.println(al1);
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i:al1)
            hs.add(i);
        
        int c[]= new int[hs.size()];
        int p=0;
        for(int i:hs)
        {
            c[p]=i;
            p++;
        }   
            return c;
    }
}
