package fileWritingmethods;

import java.io.FileWriter;
import java.io.IOException;

public class filewritingLesson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//File location and file content
		
		 String fileLoc ="UsingFileWriter.txt";
		 String content ="Learning File writing";
		 
		 FileWriter fw = new FileWriter(fileLoc);
		 fw.write(content);
		 fw.close();
		 

	}

}
