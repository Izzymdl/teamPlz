import java.util.*;

import javax.swing.*;



public class guiProj {

	private static Map<String, String> myData;
	
	private JFrame myFrame;
	private JLabel
	
	public guiProj(){
		
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new guiProj(); }
		});
	}

}
