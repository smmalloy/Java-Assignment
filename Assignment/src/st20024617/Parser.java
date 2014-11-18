package st20024617;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.*;

public class Parser {

	private static final String filePath = "C:\\Users\\joe\\Desktop\\Java Assignment\\tweets.txt";

	public void ReadTweets(){
		try {
			FileReader reader = new FileReader(filePath);
			JSONObject obj = new JSONObject();
			


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
