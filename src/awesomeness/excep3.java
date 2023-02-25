package awesomeness;

public class excep3 {
	//Nested try and catch
	public static void main(String[] args) {
		System.out.println("***main starts***");
        try
        {int i=14/2;
         int[] arr= {10,20,30};
         try
         {
        	 System.out.println(arr[i]);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
        	 System.out.println("Handled...");
         }
        	
        }
        catch(Exception e)
        {
        	System.out.println("caught");
        }
        System.out.println("***main ends***");
	}
}
