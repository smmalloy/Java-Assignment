package st20024617;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public String read(){
		
	
	String tweets = "";
	BufferedReader br = null;
	try {
		String line;
		FileReader fr = new FileReader("C:\\tweets.txt");
		br = new BufferedReader(fr);
		while ((line = br.readLine()) != null) {
			tweets += line + "\n";
		}
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if (br != null)
				br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	return tweets;
	}
}
