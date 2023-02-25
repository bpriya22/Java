package patterns;

public class solid_diamond {
	public static void main(String[] args) {
		int n=13;
		int space=n/2;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" *");
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
