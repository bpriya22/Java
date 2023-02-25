package concept;

import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
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
