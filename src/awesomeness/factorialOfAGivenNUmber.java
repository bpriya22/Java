package awesomeness;

public class factorialOfAGivenNUmber {
	public static void main(String[] args) {
		int num=5;
		int fact=1;
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact+ " is the factorial of "+num);
	}

}
