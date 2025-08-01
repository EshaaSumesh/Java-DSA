import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
        String name="Rajesh Kumar";
        String name="raJeSH KUmaR";
        System.out.println("Name:"+name.toLowerCase()); //lower
        System.out.println("Name:"+name.toUpperCase());//upper
        System.out.println("Name:"+name.charAt(0));//character retrieve
        System.out.println("Name:"+name.length());//length
        
        for(int i=0;i<name.length();i++)
        {
            System.out.println("Character at "+i+":"+name.charAt(i));
        }
         System.out.println("Substring:"+name.substring(0,8));*/
         String name="raJeSH KUmaR";
         name=name.toLowerCase();
         System.out.println(name.substring(0,1).toUpperCase()+name.substring(1));
         System.out.print(name.length());
         
    
         
    }
}
