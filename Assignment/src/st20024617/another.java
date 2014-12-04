package st20024617;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.util.HashMap; 
import java.util.Vector; 
public class another { 
private String pathToSWN = "H:\\Java\\Java-Assignment-master\\Java-Assignment-master\\SentiWordNet_3.0.0.txt"; 
private HashMap<String, Vector<Double>> _dict; 
public another(){ 
_dict = new HashMap<String, Vector<Double>>(); 
try{ 
BufferedReader csv = new BufferedReader(new 
FileReader(pathToSWN)); 
String line = ""; 
while((line = csv.readLine()) != null) 
{ 
if(!line.startsWith("#")){ 
String[] data = line.split("\t"); 
String[] words = data[4].split(" ");
for(String w:words) 
{ 
String[] w_n = w.split("#"); 
if(w_n[1].equals("1")){ 
Vector<Double> vector=new Vector<Double>(); 
vector.add(Double.parseDouble(data[2])); 
vector.add(Double.parseDouble(data[3])); 
w_n[0] += "#"+data[0]; 
_dict.put(w_n[0], vector); 
} 
} 
} 
} 
} 
catch(Exception e){e.printStackTrace();} 
} 
public Vector<Double> extract(String word, String pos) 
{ 
return _dict.get(word+"#"+pos); 
} 
public static void main(String args[]) throws Exception { 

} 
} 

