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

    }
}    
    
