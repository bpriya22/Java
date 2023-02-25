package awesomeness;

public class excep2 {
	public static void main(String[] args) {
		System.out.println("***main starts***");
		try {
			int i=1/0;
			System.out.println("hello");
		}
		//System.out.println("cool...");
		catch(Exception e)
		{
			System.out.println("handled...");
		}
		System.out.println("***main ends***");
	}
}
