package concept;
import java.io.File;
public class Filehandling {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\priya\\OneDrive\\Desktop\\Priya");
		if(f1.mkdirs()) {
			System.out.println("folder is created");
		}
		else {
			System.out.println("folder is not created");
		}
		if(f1.exists())
		{
			System.out.println("folder exists");
		}
		else
		{
			System.out.println("folder doesn't exists");
		}
     	if(f1.delete())
 		{
 			System.out.println("folder is deleted");
		}
		
	}

}
