package awesomeness;
import java.util.Scanner;
public class Fizzbuzz {
public static void main(String[]args)
{ Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int a=sc.nextInt();
  if (a%3==0&&a%7==0)
  {
	  System.out.println("fizzbuzz");
  }
  else if(a%3==0)
	  System.out.println("fizzfizz");
	
  
 else if(a%7==0) {
     System.out.println("buzzbuzz");}
 else {
	 System.out.println("not divisible by both 3 and 7");
 }
}
}

