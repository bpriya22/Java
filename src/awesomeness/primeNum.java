package awesomeness;

import java.util.Scanner;

public class primeNum {
	public static void main(String[]args)
	{   Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number..:");
	    int num=sc.nextInt();
		int count=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0) {
			
			count++;
		}
	 }
		if(count==2)
			System.out.println("Prime number");
		else if(count>2)
			System.out.println("Not a prime number");
		
		sc.close();
	}
	
}
		
		
		
		
	