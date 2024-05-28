package fileWritingmethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LearnFileWritingUsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "usingPathfile.txt";
		String content = "finishing the day with a scary note";
		
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());
		

	}

}
