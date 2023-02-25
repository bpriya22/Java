package hallow_patterns;

public class triangle4 {
 public static void main(String[] args) {
	int n=7;
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(j==n||i+j==n+1&&i<=n/2+1||i==j&&i>=n/2+1)
			{
				System.out.print(" *");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
