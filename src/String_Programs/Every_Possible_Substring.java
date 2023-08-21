
package String_Programs;

public class Every_Possible_Substring {
    public static void main(String[] args) {
        String s= "AmanDhillon";
        
        for(int i=1;i<=s.length();i++)
        {
            System.out.println("SubStrings of Length "+ i + ":");
            epSubstrings(s,i);
        }
    }
    
    static void epSubstrings(String s, int k)
    {
        int l=s.length();
        String sub;
        
        for(int i=0;i<=l-k;i++)
        {
            sub= s.substring(i,i+k);
            System.out.println(sub);
        }
        
    }
    
    
}
