package question1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
	public static void main(String[] args) throws IOException {
		FileReader filereader=new FileReader("D:/Stsjavaprojectallfile/unit5day3assignment/ramiukaka.text");
		int index=filereader.read();
		while(index!=-1) {
			System.out.println((char)index);
			index=filereader.read();
		}
		

}
}
