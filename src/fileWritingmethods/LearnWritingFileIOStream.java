package fileWritingmethods;

import java.io.FileOutputStream;
import java.io.IOException;

public class LearnWritingFileIOStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String location = "fileIOStream.txt";
        String content ="using file output stream";
        
        FileOutputStream fos = new FileOutputStream(location);
        
        byte[] writeThis = content.getBytes();
        
        fos.write(writeThis);
        fos.close();
	}

}
