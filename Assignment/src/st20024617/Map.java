package st20024617;
public class Map {
	 public Double array(Double Result, Double longi, Double lat, int maxlongi, int maxlat){
	 int divide3maxlongi = (int) (longi/3);
	 int divide3maxlat = (int) (lat/3);

	
	 //System.out.println("  "+ lat +"  "+maxlat);
	 //System.out.println("   " + longi +"  "+maxlongi);
	 
	 if (longi >= 47.721891 && longi <= 52.19455966666667 && lat >= -122.689050 && lat <= -109.8716683333333){	 
		 Main.map[0][0] = Result + Main.map[0][0];
	}
	 
	 if (longi >= 52.19455966666667 && longi <= 56.66722833333333 && lat >= -122.689050 && lat <= -109.8716683333333){	 
		 Main.map[0][1] = Result + Main.map[0][1];
	}
	if (longi >= 56.66722833333333 && longi <= 61.139897 && lat >= -122.689050 && lat <= -109.8716683333333){	 
		 Main.map[0][2] = Result + Main.map[0][2];
	}
	 
	 System.out.println(Main.map[0][0]);
	 System.out.println(Main.map[0][1]);
	 System.out.println(Main.map[0][2]);
  return Main.map[0][0];
	}
}
 