package fileWritingmethods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LearningfileWritingUsingBuffer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       String location = "usingBufferWriter.txt";
       String content = "I have now written file content using buffered writer";
       
       FileWriter fw = new FileWriter(location);
       BufferedWriter bw = new BufferedWriter(fw);
       
       bw.write(content);
       bw.close();
	}

}
