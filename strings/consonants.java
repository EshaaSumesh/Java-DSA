import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
      String input="Beautiful Day";
      String result="";
    
      
      for(int i=0;i<input.length();i++)
      {
          char ch=input.charAt(i);
          if(!"aeiou".contains(String.valueOf(ch)))
          {
              result+=ch;
          }
          
      }
      System.out.println("Without vowels:"+result);
         
    }
}
