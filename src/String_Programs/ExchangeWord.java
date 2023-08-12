
package String_Programs;

import java.util.*;
public class ExchangeWord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(exchange(input));
    }
    
    static String exchange(String s)
    {
        String a[]= s.split(" ");
        int l=a.length;
        
        String temp;
        temp= a[0];
        a[0]=a[l-1];
        a[l-1]=temp;
        String ans="";
        
        for(int i=0;i<l;i++)
        {
            ans= ans+a[i]+" ";
        }
        ans=ans.trim();
        return ans;
    }
}
