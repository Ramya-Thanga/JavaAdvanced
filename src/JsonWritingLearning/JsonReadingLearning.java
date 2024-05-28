package JsonWritingLearning;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingLearning {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
	    FileReader fr = new FileReader("jsonWritten");
	    Object parsedObject = parser.parse(fr);
	    
	    JSONObject object = (JSONObject) parsedObject;
	    String name = (String) object.get("Name");
	    long age = (long) object.get("Age");
	    System.out.println("NAME: " + name);
	    System.out.println("Age: " + age);
	    
	    JSONArray array= (JSONArray) object.get("Character");
	    Iterator iterator =array.iterator();
	    while(iterator.hasNext())
	    {
	    		System.out.println("Character " +iterator.next());
	    }
	}

}
