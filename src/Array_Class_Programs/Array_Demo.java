

package Array_Class_Programs;

import java.util.*;


public class Array_Demo {
    public static void main(String[] args) {
        int a[]={90,10,50,40,30};
        int b[]={90,10,50,40,30};
        System.out.println(Arrays.equals(a,b));
//        System.out.println(a);  ---> this printing does not work in array
// instead we write:
Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.equals(a,b));
        
        //.equals vich dova arrays di values and order same hona chahida and 
        //length also
        
    }
    
}
