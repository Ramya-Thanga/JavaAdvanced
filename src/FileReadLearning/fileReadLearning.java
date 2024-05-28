package FileReadLearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReadLearning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location ="usingBufferWriter.txt";
		
		FileReader FR = new FileReader(location);
		BufferedReader br= new BufferedReader(FR);
		
		String currentLine;
		
	    while((currentLine = br.readLine())!=null)
	    {
		System.out.println(currentLine);
		}

	}

}
