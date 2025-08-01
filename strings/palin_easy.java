import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
       String input="Hello";
       StringBuilder sb=new StringBuilder(input);
       String reversed=sb.reverse().toString();
       System.out.println("Reverse String:"+reversed);
       
       if(input.equals(reversed))
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
         
    }
}
