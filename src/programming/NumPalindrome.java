package programming;

public class NumPalindrome {
	public static void main(String[] args) {
		int num=1214;
		int copy=num;
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(rev==copy)
			System.out.println("p");
		else
			System.out.println("n");
	}

}
