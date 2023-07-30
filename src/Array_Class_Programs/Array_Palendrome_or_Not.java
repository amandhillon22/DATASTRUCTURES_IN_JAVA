
package Array_Class_Programs;


public class Array_Palendrome_or_Not {
    public static void main(String[] args) {
        int a[]= {10,20,30,20,19};
        System.out.println(check(a));
    }
    
    static boolean check(int a[])
    {
        boolean match=true;
        int N=a.length;
        for(int i=0;i<=N/2-1;i++)
        {
            if(a[i]!=a[N-1-i])
            {
                match=false;
                break;
            }
        }
        return match;
    }
}
