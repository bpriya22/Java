package concept;

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet l1=new HashSet();
		l1.add(10);
		l1.add(20.56);
		l1.add('A');
		l1.add(10);
		l1.add(true);
		for(Object o1:l1)
		{
			System.out.println(o1);
		}
	}

}
