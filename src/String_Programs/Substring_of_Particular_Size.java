
package String_Programs;


public class Substring_of_Particular_Size {
    public static void main(String[] args) {
        String s= "AmanDhillon";
        int k=3;
        allSubstrings(s,k);
    }
    
    static void allSubstrings(String s, int k)
    {
        int i, l=s.length();
        String sub;
        
        for(i=0;i<=l-k;i++)
        {
           sub= s.substring(i,i+k);
            System.out.println(sub);
        }
    }
}
