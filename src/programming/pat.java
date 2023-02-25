package programming;

import java.util.Arrays;
import java.util.Scanner;

public class pat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.next().toLowerCase();
		System.out.println("enter the size");
		String str2=sc.next().toLowerCase();
		if(str1.length()==str2.length())
		{
			char ch[]=str1.toCharArray();
			char bh[]=str2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(bh);
			System.out.println("ch[]--->"+Arrays.toString(ch));
			System.out.println("bh[]--->"+Arrays.toString(bh));
			boolean flag=true;
			for(int i=0;i<bh.length;i++)
			{
				if(ch[i]!=bh[i])
				{
					flag=false;
					break;
				}
			  if(flag==true)
			  {
				  System.out.println("its anagram");
			  }
			  else
			  {
				  System.out.println("its not anagram");
			  }
			}
			
		}
		else
			System.out.println("its not an anagram:");
		
	}
}
