package st20024617;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Parser {
	public static String tweet;
	static int RoundedMaxlat;
	static int RoundedMaxLongi;
	static double maxlongi = 0.0;
	static double maxlat = 0.0;	
	static Double longi = 0.0;
	static Double lat = 0.0;
	
	public static void parse() throws FileNotFoundException,JSONException {
		Reader reader = new Reader();
		//System.out.println("File Content: \n" + tweets);
		JSONObject js = new JSONObject(reader.read());	
		
		JSONArray jsarray =  js.getJSONArray("tweets");
		
	    int size = jsarray.length();

	    for (int i = 0; i < size; i++)
	    {
	        JSONObject user = jsarray.getJSONObject(i);
	        SWN3 SWN3 = new SWN3();
	        Double result = SWN3.extractSentence(user.getString("message").toLowerCase().split(" "));
			JSONArray coords = jsarray.getJSONObject(i).getJSONArray(
					"coordinates");

			longi = (Double) coords.get(0);
			lat = (Double) coords.get(1);
			
			if (lat < maxlat){
				maxlat = lat;
			}
			if (longi > maxlongi){
				maxlongi = longi;
			}
			RoundedMaxlat = (int) Math.ceil( ((Double)maxlat - 1));
			RoundedMaxLongi = (int) Math.ceil( ((Double)maxlongi));
			 Map m = new Map();
			 m.array(result,longi, lat, RoundedMaxLongi, RoundedMaxlat);
//System.out.println(m.array(result,longi, lat, RoundedMaxLongi, RoundedMaxlat));
	    }
	}	
}