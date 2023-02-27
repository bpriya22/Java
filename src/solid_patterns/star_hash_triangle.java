package solid_patterns;

public class star_hash_triangle {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print("* ");
				}else
				{
					System.out.print("# ");
				}
				
			}
			System.out.println();
		}
	}

}
