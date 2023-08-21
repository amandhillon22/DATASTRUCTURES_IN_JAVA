
package String_Programs;

import java.util.*;
public class Weight_ofEach_Word {
    public static void main(String[] args) {
        String s= "abc Hello World How Are Aman";
        printWeights(s);
    }
    
    static void printWeights( String s)
    {
     StringTokenizer st = new StringTokenizer(s);
     int i, n=st.countTokens();
     
     for(i=1;i<=n;i++)
     {
         String p=st.nextToken();
         int weight= weights(p);
         System.out.println("Weight of Word "+ p + " = "+ weight);
         
     }
    }
     static int weights(String s)
     {
         char ch;
         int sum=0;
         
         for (int i=0; i<s.length();i++)
         {
             ch=s.charAt(i);
             if(Character.isUpperCase(ch))
             {
                 sum=sum+(ch-64);
             }
             else
             {
             sum=sum + (ch-96);
             }
         }
         return sum;
     }
    }
    

