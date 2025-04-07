import java.util.HashMap;
import java.util.PriorityQueue;
public class Main
{
   public static void main(String [] args)
{
    HashMap <String,Integer> freq=new HashMap<>();
    PriorityQueue<Integer> min=new PriorityQueue<>();
    String [] task={"A","A","A","A","A","C","C","C","B","B"};
    
    for (String i:task)
    {
        if(freq.containsKey(i))
        {
            freq.put(i,freq.get(i)+1);
        }
        else 
        {
            freq.put(i,1);
        }
    }
    System.out.println(freq); //frequency 
    min.addAll(freq.values());  //minheap
    System.out.print(min);
    
    
} 

}
