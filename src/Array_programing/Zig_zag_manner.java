package Array_programing;

import java.util.Arrays;

public class Zig_zag_manner {
	public static void main(String[] args) {
		int x=0;
		int y=0;
		int a1[]= {1,2,3,4};
		int a2[]= {7,8,9,10};
		int Ans[]=new int[a1.length+a2.length];
		for(int i=0;i<Ans.length;i++)
		{if(i%2==0)
		{
			Ans[i]=a1[x];
		    x++;
		}
		else {
			Ans[i]=a2[y];
			y++;
		    }
		}
		System.out.println(Arrays.toString(Ans));
	}

}
