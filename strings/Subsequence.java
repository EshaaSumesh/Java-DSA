import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
      
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter original text: ");
      String s1=sc.next();
      System.out.println("Enter target text: ");
      String s2=sc.next();
      
      int count=0;
      
      for(int i=0; (i<s1.length()) && (count<s2.length()) ;i++)
      {
          if(s1.charAt(i)==s2.charAt(count)) count++;
      }
      if(count==s2.length()) System.out.print("Found");
      else System.out.print("Not Found");
    }
}    
    
