
package Array_Class_Programs;

import java.util.*;

public class Copying_Array {
    public static void main(String[] args) {
        int a[]={2,4,6,5,7,8,9,0,4,3,5};
        
        int b[]=Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
        int e[]=Arrays.copyOfRange(a, 0, 5);
        System.out.println(Arrays.toString(e));
        
        int f[]=Arrays.copyOfRange(a, 5, 8);
        System.out.println(Arrays.toString(f));
        
        //general loop for generating sub-arrays from any array of any
        //length and making sub-arrays of any size:
        System.out.println("Sub-Array Output:");
        
        int size=4;
        for(int i=0; i<=a.length-size; i++)
        {
            int g[]=Arrays.copyOfRange(a, i, i+size);
            System.out.println(Arrays.toString(g));
        }
    }
    
}
