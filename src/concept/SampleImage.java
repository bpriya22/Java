package concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SampleImage {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\priya\\OneDrive\\Desktop\\01.jpg");
		FileInputStream fin=new FileInputStream(f1);
		byte[]arr=new byte[(int)f1.length()];
		fin.read(arr);
		FileOutputStream fout=new FileOutputStream("C:\\\\Users\\\\priya\\\\OneDrive\\\\Desktop\\\\02.jpg");
		fout.write(arr);
		fout.flush();
	}

}
