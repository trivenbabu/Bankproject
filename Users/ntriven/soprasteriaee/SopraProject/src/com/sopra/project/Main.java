package com.sopra.project;

public class Main {
	double balance;
	public double deposit(double amt,String acc)
	{
	
		balance+=amt;
		return balance;
	}
	public double withdraw(double amt)
	{
	balance-=amt;
		return balance;
	}
	public double display()
	{
		return balance;
	}

	public static void main(String[] args) {
		Main m=new Main();
		Bank b=new Bank(1,"SBI","10101");
		 System.out.println(b);
		System.out.println("deposited amt in Acc number "+b.getAccNumber()+ " is "+m.deposit(10000,b.getAccNumber()));
		System.out.println("withdraw amt in Acc number " +b.getAccNumber()+"is "+m.withdraw(5000));
		System.out.println( "remaining balance in Acc number "+ b.getAccNumber()+ " is "+m.display());
		

	}

}
