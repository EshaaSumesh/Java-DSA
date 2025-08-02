import java.util.*;
class Main
{
    public static void main(String[] args) 
   {
       LinkedList <String> fruits=new LinkedList<>();
       fruits.add("Mango");
       fruits.add("Banana");
       fruits.add("Grapes");
       fruits.addFirst("Apple"); 
       System.out.println(fruits);
       fruits.addLast("Papaya");
       System.out.println(fruits);
       fruits.remove("Mango");//removes specific value
       System.out.println(fruits);
       fruits.removeLast();//remove last element
       System.out.println(fruits);
       fruits.removeFirst();//remove first element
       System.out.println(fruits); 
       
   }
   
}
