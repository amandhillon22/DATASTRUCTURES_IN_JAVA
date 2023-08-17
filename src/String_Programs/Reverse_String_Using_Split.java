
package String_Programs;


public class Reverse_String_Using_Split {
    public static void main(String[] args) {
        String s= "I want to travel the world";
        System.out.println(reverse(s));
    }
    
    static String reverse(String s)
    {
        String a[]=s.split(" ");
        String rev="";
        
        for(int i=a.length-1;i>=0;i--)
        {
            rev= rev+ a[i]+" ";
        }
        rev=rev.trim();
        return rev;
    }
}
