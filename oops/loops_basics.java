import java.util.*;

class Main {
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int upin;
       int count=0;
       int pin=1234;
       do
       {
           count++;
           if(count>3)
           {
                System.out.print("exceeded!!!!!");
                return;
           }
            System.out.print("enter correct pin");
            upin=sc.nextInt();
       }
       while(upin!=pin);
       System.out.print("Continue banking");
    }
}
