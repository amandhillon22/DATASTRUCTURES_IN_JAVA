
package Array_Class_Programs;


import java.util.*;

public class Array_Rotate_Last_Element_To_Front 
{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90,100};
        int N=a.length;
        int k=7;
        rotate(a,N,k);
        System.out.println(Arrays.toString(a));
    }
    
    static void rotate(int a[], int N, int k)
    {
        int b[]= new int[k];
        for(int i=0; i<k;i++)
        {
            b[i]=a[N-k+i];
        }
        for(int i=N-k-1; i>=0;i--)
        {
            a[i+k]=a[i];
        }
        for(int i=0; i<k;i++)
        {
            a[i]=b[i];
        }
    }
 
}


