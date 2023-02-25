package programming;

public class Factors_of_a_given_number {
public static void main(String[] args) {
	int num=10;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
			System.out.println(i);
	}
}
}
