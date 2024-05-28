package JsonWritingLearning;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingLearning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         JSONObject jsonObject = new JSONObject();
         jsonObject.put("Name", "Ramya");
         jsonObject.put("Age", "43");
         
         JSONArray array = new JSONArray();
         array.add("hardworking1");
         array.add("boring");
         
         jsonObject.put("Character", array);
         
         FileWriter fw = new FileWriter("jsonWritten");
         fw.write(jsonObject.toJSONString());
         fw.close();
	}

}
