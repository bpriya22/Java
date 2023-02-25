package awesomeness;

public class excep8 {
	public static void main(String[] args) {
		System.out.println("***main starts***");
		try {
			int i=1/0;
		}
		finally {
			System.out.println("Im finally back...");
		}
		System.out.println("***main ends***");
	}

}
