package awesomeness;

import java.util.Scanner;
public class HackerRank {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
	    if(n%2!=0)
	   {
	       System.out.println("Weird");
	   }
	    else if(n>2 && n<5)
	    {
	    	System.out.println(" Not Weird");
	    }
	    else if(n>6 && n<20)
	    {
	    	System.out.println("Weird");
	    }
	    else
	    {
	    	System.out.println(" Not Weird");
	    }
	}
}

		