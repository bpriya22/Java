package awesomeness;


interface Nike
{
	void shoes();
}
interface Puma extends Nike
{
	void bags();
}
public class Awesomejava implements Puma
{
	public void bags()
	{
		System.out.println("karthika masa bags" );
	}
	public void shoes()
	{
		System.out.println("karthikamasa shoes");
	}
	public static void main(String[] args)
	{
		Awesomejava r1=new Awesomejava();
		r1.bags();
		r1.shoes();
	}
}


