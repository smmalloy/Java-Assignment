package st20024617;

public class Tweet {

	private String id;
	private String dateTime;
	private double longditude;
	private double latitude;
	private String message;
	
	public Tweet(String id, String dateTime, double longditude,
			double latitude, String message) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.longditude = longditude;
		this.latitude = latitude;
		this.message = message;
		
		sentimentValue = 0.0;
		hasvaluebeenset = false;
		
	}
	
	
	
	private double sentimentValue;
	private boolean hasvaluebeenset = false;
	public double getSentimentValue() {
		return sentimentValue;
	}
	public void setSentimentValue(double sentimentValue) {
		this.sentimentValue = sentimentValue;
	}
	public boolean isHasvaluebeenset() {
		return hasvaluebeenset;
	}
	public void setHasvaluebeenset(boolean hasvaluebeenset) {
		this.hasvaluebeenset = hasvaluebeenset;
	}
	public String getId() {
		return id;
	}
	public String getDateTime() {
		return dateTime;
	}
	public double getLongditude() {
		return longditude;
	}

	public double getLatitude() {
		return latitude;
	}
	public String getMessage() {
		return message;
	}
	
	
	
}
