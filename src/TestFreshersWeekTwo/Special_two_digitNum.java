package TestFreshersWeekTwo;

import java.util.Scanner;

public class Special_two_digitNum {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int num1=sc.nextInt();
	int d1=num1%10;
	int d2=num1/10;
	int res=d1+d2+d1*d2;
	if(res==num1)
	{
		System.out.println(num1+" is a special two digit number...");
	}

  }
}
