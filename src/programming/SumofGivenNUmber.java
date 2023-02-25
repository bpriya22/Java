package programming;

public class SumofGivenNUmber {
	
	   static int numsum(int nu) {
		int sum=0;
		while(nu!=0)
		{
			int rem=nu%10;
			sum=sum+rem;
			nu=nu/10;
	    }
		return(sum);
	 }
	   public static void main(String[] args) {
		   int num=6789;
			while(num>=10)
				num=numsum(num);
			System.out.println(num);
	   }
}
