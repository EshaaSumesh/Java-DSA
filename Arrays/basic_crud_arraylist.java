//import java.util.Scanner;
//import java.util.ArrayList;
import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
      List <String> fruits =new ArrayList<>();
      //CREATE
      fruits.add("Apple"); //method-add
      fruits.add("Banana");
      fruits.add("Orange");
      fruits.add("Annachi");
      
      //READ
      System.out.println(fruits);
      
      //UPDATE
      fruits.set(1,"Mango");
      System.out.println(fruits);
      
      //DELETE
      fruits.remove("Orange");
      System.out.println(fruits);

     List<Integer> diary=new ArrayList<>();
        
        //create
        diary.add(123);
        diary.add(543);
        System.out.println(diary);
        //update
        diary.set(1,355);
        
        diary.remove(0); //integer,remove using index
        System.out.println(diary);   

    }
}    
    
