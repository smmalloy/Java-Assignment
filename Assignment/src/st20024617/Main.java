package st20024617;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
	 public static void main(String[] args){
	{
    try {
        SentiWordRating test = new SentiWordRating("C:\\Users\\joe\\Desktop\\Java Assignment\\SentiWordNet_3.0.0.txt");
        
        
 Double value = test.getRating("sad");
 System.out.println(value.toString());
 
 } catch (Exception e1) {
        
        e1.getMessage();
        e1.printStackTrace();
 }

	}
}

}
