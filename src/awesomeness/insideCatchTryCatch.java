package awesomeness;

public class insideCatchTryCatch {
	public static void main(String[] args) {
		System.out.println("***main starts***");
		try {
			int i=14/0;
		}
		catch(Exception e)
		{
			int[]arr= {10,20,30,40};
			try {
				System.out.println(arr[9]);
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("handled...");
			}
		}
		System.out.println("***main ends***");
	}

}
