
package String_Programs;

import java.util.*;
public class String_Reverse_Using_Tokenizer {
    public static void main(String[] args) {
        String s= "I want to travel the world";
        System.out.println(reverseTokens(s));
    }
    
    static String reverseTokens(String s)
    {
        StringTokenizer st= new StringTokenizer(s);
        int i, n=st.countTokens();
        String ans="";
        
        for(i=n;i>=1;i--)
        {
            ans= st.nextToken() + " " + ans;
        }
        ans = ans.trim();
        return ans;
    }
}
