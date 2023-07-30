
package Array_Class_Programs;


public class Char_Array_Reverse_LEETCODE_Q344 {
    public static void main(String[] args) {
        char a[]={'h','e','l','l','o'};
       revCharArr(a);
        System.out.println(a);
    }
    
   public static void revCharArr(char []c)
    {
        int N=c.length;
        char t;
        for(int i=0; i<=N/2-1;i++)
        {
            t=c[i];
            c[i]=c[N-1-i];
            c[N-1-i]=t;
            
        }
        
    }
}
