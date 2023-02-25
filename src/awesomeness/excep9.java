package awesomeness;

public class excep9 {
public static void main(String[] args) {
	System.out.println("***main starts***");
	try {
		int i=1/0;
		}
	catch(Exception e){
		System.out.println("handled...");
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("handled..");
	}
	System.out.println("***main ends***");
}
}
