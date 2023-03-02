package solid_patterns;

public class diamondabc {
	public static void main(String[] args) {
		int n=5;
		int star=1;
		int space=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
				if(k%2==0)
				{
				 System.out.print(" b");
				}else
				{
					System.out.print(" a");
				}
			{
				
			}
			System.out.println();
			if(i<n/2+1)
			{
				star=star+2;
				space--;
			}else
			{
				star=star-2;
				space++;
			}
		}
	}
}
