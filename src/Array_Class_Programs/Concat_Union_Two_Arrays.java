
package Array_Class_Programs;

import java.util.*;

public class Concat_Union_Two_Arrays {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,50};
        int b[]={60,70,80,90,100};
        int c[]= union(a,b);
        System.out.println(Arrays.toString(c));
    }
    
    static int[] union(int a[], int b[])
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for(int i:a)
        {
            lhs.add(i);
        }
        for(int i:b)
        {
            lhs.add(i);
        }
        int c[]= new int[lhs.size()];
        int p=0;
        for(int i:lhs)
        {
            c[p]=i;
            p++;
        }
        return c;
    }
}
