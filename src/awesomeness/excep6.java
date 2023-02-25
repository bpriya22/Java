package awesomeness;

public class excep6 {
	public static void main(String[] args) {
		System.out.println("***main starts***");
		int[]arr= {10,20,30,40,50};
		try {
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("caught...");
		}
		System.out.println("***main ends***");
	}

}
