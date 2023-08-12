
package String_Programs;

import java.util.*;
public class Reverse_EachWord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
         String st= scan.nextLine();
         reverseWord(st);
    }
    
    public static void reverseWord(String s)
    {
        StringTokenizer st= new StringTokenizer(s);
        String p, ans="";
        int i, n=st.countTokens();
        
        for(i=1;i<=n;i++)
        {
            p=st.nextToken();
            StringBuffer sb= new StringBuffer(p);
            sb.reverse();
            ans= ans+ " "+ sb.toString()+" ";
            ans= ans.trim();
        }
        System.out.println(ans);
    }
   
}
