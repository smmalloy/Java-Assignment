package st20024617;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class SentiWordRating_FirstInstanceOfWordOnly {

	private String FilePath;
	private Map<String, Double> mDictionary;

	public SentiWordRating_FirstInstanceOfWordOnly(String filePath) throws IOException 
	{

		setFilePath(filePath);
		//Create new hashmap to hold terms and absolute rating (positive - negative)
		mDictionary = new HashMap<String,Double>();
		fillDictionary();
	}

	public void setFilePath(String filePath) throws IOException
	{
		//Convert filepath to file and check if it exists before updating filepath variable
		File file = new File (filePath);
		if (file.exists() && !file.isDirectory())
		{
			this.FilePath=filePath;
		}
		else
		{
			throw new IOException("Error - File does not exist at this location: " + filePath);
		}

	}

	public String getFilePath()
	{
		return this.FilePath;
	}

	private void fillDictionary() throws IOException
	{

		BufferedReader tReader = null;
		String tLine;
		int tLineNum=0;
		try
		{
			//open the file reader 
			tReader = new BufferedReader(new FileReader(FilePath));	

			//read until end of file
			while ((tLine = tReader.readLine()) != null)
			{
				tLineNum++;
				//check to see if line is a comment line
				if(!tLine.trim().startsWith("#"))
				{
					//store values when split at each tab point
					String[] tData = tLine.split("\t");
					//ensure data is formatted correctly
					if(tData.length != 6)
					{
						throw new IllegalArgumentException("Incorrect Line format: " + tLineNum);
					}

					//store word/term name 
					String tTerm = tData[4].split("#")[0];

					if(!mDictionary.containsKey(tTerm))
					{
						//store the term and rating in the dictionary if it does not exist. 
						mDictionary.put(tTerm, (Double.parseDouble(tData[2]) - Double.parseDouble(tData[3])));
					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		finally
		{
			if (tReader != null)
			{
				tReader.close();
			}
		}
	}

	public Double getRating(String wordToRate) throws Exception
	{
		if (mDictionary.containsKey(wordToRate))
		{
			return mDictionary.get(wordToRate).doubleValue();
		}
		else
		{
			throw new Exception("Word does not exist in dictionary: "+wordToRate+".");
		}		
	}
}
