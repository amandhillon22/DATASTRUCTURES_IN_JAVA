
package String_Programs;

import java.util.*;
public class Longest_Word {
    public static void main(String[] args) {
        String input= "C++ JavaScript Java Python React Mongo";
        System.out.println(longestWord(input));
    }
    
    static int longestWord(String s)
    {
       StringTokenizer st= new StringTokenizer(s);
       String longest="";
       int i,n= st.countTokens();
       
       for(i=1;i<=n;i++)
       {
           String p= st.nextToken();
           if(p.length()>longest.length())
           {
               longest=p;
           }
       }
        System.out.println(longest);
        return longest.length();
    }
}
