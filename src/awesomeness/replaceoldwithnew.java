package awesomeness;
import java.util.Scanner;
public class replaceoldwithnew {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string");
		String str= sc.next();
		System.out.println(str.replace('k', 'n'));
	}

}
