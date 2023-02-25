package programming;

import java.util.Arrays;

public class ReverseAnArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int ans[]=new int[arr.length];
	for(int i=0,j=arr.length-1;i<ans.length&&j>=0;i++,j--)
	{
		ans[i]=arr[j];
	}
	System.out.println(Arrays.toString(ans));
}
}
