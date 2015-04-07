import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.awt.*;




public class encoder {
	
	private File f;
	private Scanner s;
	private PrintWriter p;
	
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
		
	}
	
	public List<String> read(){
		return
	}
}
