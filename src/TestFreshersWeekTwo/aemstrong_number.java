package TestFreshersWeekTwo;

public class aemstrong_number {
	public static void main(String[] args) {
		static int pow(int base,int power)
		{   int ans=1;
			while(power!=0)
			{
				ans=ans*base;
				power--;
			}
			return ans;
		}
		static int  count(int x)
		{
			int count=0;
			while(x!=0)
			{
			  x=x/10;
			  count++;
			}
			return count;
			
		}
		
		int num=153, copy=153, sum=0;
		sum=0;
		while(num!=0)
		{
			int d=num%10;
			sum=sum+ pow(d,count(copy));
			num=num/10;
		}
		if(sum==copy)
			System.out.println("armstrong number...");
		else
			System.out.println("not a as number...");
	}

}
