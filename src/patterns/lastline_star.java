package patterns;

public class lastline_star {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{  if(i==n)
		    {
			    for(int j=1;j<=n;j++)
			    {
			    	System.out.print(" *");
			    }
			
		    }
		  System.out.println();
		}
	}

}
