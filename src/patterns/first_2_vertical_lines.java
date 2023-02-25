package patterns;

public class first_2_vertical_lines {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||i==n)
			{
				System.out.print(" *");
			}
//			if(i==n)
//			{
//				System.out.print(" *");
//			}
//			else
//				System.out.println(" ");
		}
		System.out.println();
	}
}
}
