package question1;

import java.io.FileWriter;
import java.io.IOException;

public class Writablefile {
	public static void main(String[] args) throws IOException {
		FileWriter filewriter=new FileWriter("D:/Stsjavaprojectallfile/unit5day3assignment/ramiukaka.text");
		filewriter.write("welcome mahesh you are in india");
		filewriter.flush();
		filewriter.close();
		
	}

}
