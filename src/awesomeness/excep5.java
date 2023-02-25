package awesomeness;

public class excep5 {
	public static void main(String[] args) {
		System.out.println("***main starts***");
		try {
			int i=1/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught...");
		}
		System.out.println("***main ends***");
	}

}
