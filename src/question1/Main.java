package question1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void  main(String[] args) {
		File file=new File("D:/Stsjavaprojectallfile/unit5day3assignment/ramiukaka.text");
		try {
			boolean b=file.createNewFile();
			if(b) {
				System.out.println("new file is created");
			}
			else {
				System.out.println("file is already exist");
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
	}

}
