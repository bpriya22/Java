package awesomeness;
import java.util.Scanner;
public class Swap {
	public static void main(String[]args)
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of a:");	
	int a=sc.nextInt();
	System.out.println("Enter the value of b:");
	int b=sc.nextInt();
	int temp=a;
	a=b;
	temp=b;
	System.out.println(a+"  "+b);
		
	}

}
