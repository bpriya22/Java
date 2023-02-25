package concept;

class Main extends Thread
{
	public void run()
	{
		System.out.println("hiii");
	}

}
class Demo implements Runnable
{
	public void run()
	{
		System.out.println("hello");
	}
}
public class threadstopic{
	public static void main(String[] args) {
		Main s1=new Main();
		Thread th1=new Thread(s1);
		th1.start();
		
		Demo d1=new Demo();
		Thread th2=new Thread(d1);
		th2.start();
	}
}

	
	


