import java.util.*;

class Main 
{
    public static String revStr(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
    
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(revStr(s));
    }
}
