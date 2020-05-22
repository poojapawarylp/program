package program12;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class hate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File file=new File("filename.txt");
		if(!file.exists())
		{
				file.createNewFile();
			} 
		PrintWriter pw=new PrintWriter(file);
		pw.println("this is my file");
		pw.close();
	
		System.out.println("done");
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		
		

	

}

