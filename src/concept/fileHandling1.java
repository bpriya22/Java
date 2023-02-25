package concept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class fileHandling1 {
	File f1=new File("C:\\Users\\priya\\OneDrive\\Desktop\\riyaa");
	FileReader fr= new FileReader(f1);
	BufferedReader br=new BufferedReader(fr);
	String s1 = br.readLine();
	while(s1!=null)
	{
		System.out.println(s1);
		s1=br.readLine();
	}
	

}
