
package String_Programs;


public class Arrange_In_Alphabetical_Order {
    public static void main(String[] args) {
        String s= "Nitin Lakshay Pulkit Shaina Aman Kajal Jatin";
        System.out.println(rearrange(s));
    }
    
    static void bubbleSort(String a[])
    {
        int i,j,n=a.length;
        String temp;
        
        for(i=0;i<=n-2;i++)
        {
            for(j=0;j<=n-2-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    
    static String rearrange(String s)
    {
        String a[]= s.split(" ");
        bubbleSort(a);
        
        int i, l=a.length;
        String ans="";
        
        for(i=0;i<l;i++)
        {
            ans= ans+ a[i]+ " ";
        }
        ans=ans.trim();
        return ans;
    }
}
