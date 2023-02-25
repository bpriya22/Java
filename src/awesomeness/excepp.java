package awesomeness;

public class excepp {
	public static void main(String[] args) {
		int count=0;
		try {
			for(int i=5;i>=-10;i--)
			{
				int x=9/i;
				count++;
			}
			catch(Exception e)
			{
				System.out.println(count);
			}
		}
	}

}
