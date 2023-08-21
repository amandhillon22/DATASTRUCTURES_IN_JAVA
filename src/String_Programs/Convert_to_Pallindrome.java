
package String_Programs;

// The question is to return the value of ans,
//which represents the minimum number of characters needed to be
//added to the original string to make it a palindrome.



public class Convert_to_Pallindrome {
    public static void main(String[] args) {
        String s= "Lakshay";
        System.out.println(minChars(s));
    }
    
    static int minChars(String s)
    {
        int i, l=s.length(), ans=0;
        String t;
        if(isPallindrome(s))
        {
            return 0;
        }
        else
        {
            t= new StringBuffer(s).reverse().toString();
        }
        
        for (i=1;i<=l;i++)
        {
            String sub= s.substring(l-i);
            if(isPallindrome(t+sub))
            {
                ans= sub.length();
                System.out.println(t+sub);
                break;
            }
        }
        return ans;
    }
    
    static boolean isPallindrome(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
