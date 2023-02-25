package awesomeness;

public class excep7 {
	public static void main(String[] args) {
		System.out.println("***main starts***");
		try {
			int i=1/0;
		}
		catch(ArithmeticException e) {
			System.out.println("handled...");
		}
		finally {
			System.out.println("i'm finally back...");
		}
		System.out.println("***main ends***");
	}

}
