package HashMapCode;
import java.util.HashMap;
import java.util.Map.Entry;

public class Driver {
	public static void main(String args[])
	{
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		// Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    System.out.println(capitalCities.get("England")); //set key -> get value
	    
	    capitalCities.remove("England"); //refer the key
	    System.out.println(capitalCities);
	    
	    //capitalCities.clear();
	    //System.out.println(capitalCities);
	    
	    System.out.println(capitalCities.size());
	    
	    System.out.println(capitalCities.containsKey("Germany"));//Checks Key is present or not
	    System.out.println(capitalCities.containsValue("Germany"));//Checks Key is present or not
	    
	    //HashMap Traversal
	    for (Entry<String, String> e : capitalCities.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
	    
	    capitalCities.isEmpty();
	    
	    // Print keys
	    for (String i : capitalCities.keySet()) {
	    	System.out.println(i);
	    }
	    
	    // Print values
	    for (String i : capitalCities.values()) {
	    	System.out.println(i);
	    }
		
	    // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    
	    
	    
	}
}
