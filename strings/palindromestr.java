import java.util.*;

class Main 
{
    public static String palinDrome(String input)
    {
        String rev=new StringBuilder(input).reverse().toString();
        
        
        if(rev.equalsIgnoreCase(input))
        {
            return "Yes";
        }
        else 
        {
            return "No";
        }
    }        
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(palinDrome(s));
    }
}
