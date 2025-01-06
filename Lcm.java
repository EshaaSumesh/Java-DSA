import java.util.*;
public class Main
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter num 1:");
	    int n1=sc.nextInt();
	    System.out.println("Enter num 2:");
	    int n2=sc.nextInt();
	    int big=n1>n2?n1:n2;
	    int lcm=big;
		while(true){
	     if(lcm%n1==0 && lcm%n2==0)
	         break;
	     else 
	         lcm=big+lcm;
		}
	 System.out.println(lcm);
	}
}
