
package Array_Class_Programs;


public class Multiple_Missing_Numbers {
    public static void main(String[] args) 
        {
            int a[]={2,1,4,5,6,8,10};
            int N=10;
            MultiMissing(a,N);
        }
        
        static void MultiMissing(int a[], int N)
        {
            boolean b[]= new boolean[N+1];
            
            for(int i=0; i<a.length;i++)
            {
                int index= a[i];
                b[index]=true;
            }
            
            for(int i=1; i<b.length;i++)
            {
                if(b[i]==false)
                {
                    System.out.println(i+ "");
                }
            }
       
            
        }
    }
    

