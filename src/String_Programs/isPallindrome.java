

public class isPallindrome {
    public static void main(String[] args) {
        String s= "madam";
        System.out.println(isPallindrome(s));
    }
    
    static boolean isPallindrome(String s)
    {
        return (s.equals(new StringBuffer(s).reverse().toString()));
    }
}
