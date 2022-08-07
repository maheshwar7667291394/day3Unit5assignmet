package question3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountChracter {
	static int  count=0;
	public static void main(String[] args) throws IOException {
		FileReader filereader=new FileReader("D:/Stsjavaprojectallfile/unit5day3assignment/ramiukaka.text");
		int index=filereader.read();
//		  char ctr1='a';
		while(index!=-1) {
		     char ctr=(char)index;
		   
		     int x= Character.compare(ctr,'a');  
		  if(x==0) {
			  count++;
			  
		  }
			 index=filereader.read();
			
			
		}
		System.out.println(count);
	}
	

}
