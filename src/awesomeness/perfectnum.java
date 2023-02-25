package awesomeness;
import java.util.Scanner;
public class perfectnum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to which factor is to be done");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(sum==num)
		{
			System.out.println(num+"is Perfect number");
		}
		else
			System.out.println(num+"Not perfect number");
				
	}

}
