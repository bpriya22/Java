package programming;

public class fibonacii_series {
	public static void main(String[] args) {
		int n=10;
		int f1=1;
		System.out.println(f1);
		int f2=2;
		System.out.println(f2);
		for(int i=1;i<=n-2;i++)
		{
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(f3);
			
		}
	}

}
