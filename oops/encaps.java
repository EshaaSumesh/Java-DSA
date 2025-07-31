import java.util.*;

class  Main
{
	public static void main(String[]args)
	{
	    Scanner sc=new Scanner(System.in);
		Bank kanishka=new Bank();
		kanishka.deposit(24000);
		kanishka.withdraw(1000);
		kanishka.viewbalance();
	}
}
class Bank
{
	private int balance=0;//contructor and instantiator
	void deposit(int money)
	{
		balance=balance+money;
		System.out.println(money+"deposited successfully");
	}
	void withdraw(int money)
	{
	    balance=balance-money;
	    System.out.println("would you like to view the balance????");
	}
	void viewbalance()
	{
	    System.out.println(balance);
	}
}
