package TestFreshersWeekTwo;

import java.util.Scanner;

public class SquareofNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int res=1;
		System.out.println("enter the power..");
		int power=sc.nextInt();
		System.out.println("enter the base...");
		int base=sc.nextInt();
		while(power!=0)
		{
		  res=res*base;
		  power--;
		}
		System.out.println("the answer is "+res);
		
	}

}
