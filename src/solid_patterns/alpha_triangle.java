package solid_patterns;

public class alpha_triangle {
public static void main(String[] args) {
	int n=7;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%2!=0)
			{
				System.out.print(" "+(char)(j+96));
			}else
			{
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
}
}
