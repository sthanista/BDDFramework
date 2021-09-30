import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import junit.framework.Assert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsontest {
    public static void main(String [] args) throws IOException, ParseException {
        FileReader file = new FileReader("C:\\Users\\466682\\IdeaProjects\\BddFrameworkProject\\jsondata.json");
        JSONParser jp = new JSONParser();
        Object ob = jp.parse(file);
        JSONObject jo = (JSONObject) ob;
        String name =  (String)jo.get("Name");
        Assert.assertEquals("Denu",name);
        // Read JSON arrays and JSON objects
        JSONArray ar = (JSONArray) jo.get("city");
        System.out.print(ar);

    }
}
