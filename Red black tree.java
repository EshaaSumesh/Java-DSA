
import java.util.*;

class Main
{
    public static void main (String[]args)
    
    {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(2);
        System.out.print(set);
        //make a list and retrieve elements 
        List<Integer> l=new ArrayList<>(set);
        System.out.print(l.get(1));
    }
}
