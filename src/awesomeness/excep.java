package awesomeness;

public class excep {
	public static void main(String[]args)
	{
		try
		{
			int[] arr= {10,20,30};
			System.out.println(arr[9]);
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		System.out.println("***main ends***");
	}

}
