package awesomeness;

public class excep4 {
	public static void main(String[] args) {
		System.out.println("***main Starts***");
		try {
			int i=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled...");
		}
		System.out.println("***main ends***");
	}

}
