
package Array_Class_Programs;


public class Reverse_An_Array {
    public static void main(String[] args) {
        int a[]= {10,20,30,40,50,60};
        int[] result= reverseArray(a);
        for (int element: result)
        {
            System.out.print(element+ " ");
        }
    }
    
    static int[] reverseArray(int a[])
    {
        int N= a.length;
        int t;
        for(int i=0; i<N/2;i++)
        {
            t=a[i];
            a[i]=a[N-1-i];
            a[N-1-i]=t;
        }
        return a;
    }
    
}
