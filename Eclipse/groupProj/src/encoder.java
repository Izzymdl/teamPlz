import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.awt.*;




public class encoder {
	
	private File f;
	private Scanner s;
	private PrintWriter p;
	private Map<String, List<String>> myData;
	
	public encoder(String filename){
	f = new File(filename);
	try {
		Scanner s = new Scanner(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		PrintWriter p = new PrintWriter(f);
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
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public List<String> read(){
		return myData.get(f);
	}
}
