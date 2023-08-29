
package Recursion_Programs;


public class String_Reverse {
    public static void main(String[] args) {
        String s= "Lakshay";
        int i=s.length();
        String ans = "";
        reverse(s,i-1,ans);
    }
    
    static void reverse(String s, int i, String ans)
    {
        if(i==0)
        {
            ans= ans + s.charAt(0);
            System.out.println(ans);
        }
        else
        {
            ans= ans+ s.charAt(i);
            reverse(s,i-1,ans);
        }
    }
}
