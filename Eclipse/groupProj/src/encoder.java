import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




public class encoder {
	
	private File f;
	private Map<String, List<String>> myData;
	
	public encoder(String filename){
	f = new File(filename);
	try {
		Scanner s = new Scanner(f);
		s.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	}
	
	public void write(String plaintext){
		try {
			PrintWriter p = new PrintWriter(new File(plaintext));
			
			String msg = myData.get(plaintext).toString();
			
			p.print(msg);
			p.close();
		
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public List<String> read(){
		return myData.get(f);
	}
}
