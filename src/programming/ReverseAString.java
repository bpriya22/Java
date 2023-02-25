package programming;

public class ReverseAString {
public static void main(String[] args) {
	String str="Java";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
	  rev=rev+str.charAt(i);	
	}
	System.out.println(rev);
	
	if(rev==str)
		System.out.println("Palindrome");
	else
		System.out.println("not a Palindrome");
	
}
}
