package program12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class poo {

	private static Object finaly;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new FileReader("pooja pawar cv.PDF"));
			String line;
			while((line=br.readLine())!=null)
				
				
			{
				System.out.println(line);	
				
			}
        br.close();	
		}
		
		catch(IOException e)
		{
			
		}
		

	}

}
