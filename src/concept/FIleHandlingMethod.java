package concept;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleHandlingMethod {
public static void main(String[] args) throws IOException {
	//buffered write
	File f1=new File("C:\\Users\\priya\\OneDrive\\Desktop\\Priyaa.txt");
	FileWriter fw=new FileWriter(f1);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("java");
	bw.newLine();
	bw.write("hero");
	bw.newLine();
	bw.write("mava");
	bw.newLine();
	bw.write("goal");
	bw.flush();
	System.out.println("data is written...");
	
	
}
}

