package awesomeness;

public class sumofdigitsofnum {
	
	static int numsum(int num)
	{ int sum=0;
	  while(num!=0)
	  {int rem=num%10;
		 sum=sum+rem;
		 num=num/10;	  
	  }
	  return sum;
		
	}
	
  public static void main(String[] args) {
	  int num=2265;
	while(num>9) {
	  num =	numsum(num);
	}
	System.out.println(num +" is the sum of the digits of the number...");
}

}
