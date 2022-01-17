package ds;

import java.util.HashMap;

/* WHAT IS A HASHMAP?
 * A hashmap is basically a dictionary in python
 * It has a key and a value that is grouped together
 * 
 * The "put()" will add items to the Hashmap
 * The "get()" will allow you to get the value at a certain key
 * The "remove()" will remove the element with a certain key
 * The "clear()" will clear the entire hashmap
 * The "size()" will get the size of the hashmap
 * The "keySet()" is the set of all the keys
 * The "values()" is the set of all values
 */

public class Hashmap {
	public static void main (String [] args) {
		//Create
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		//Put Items
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    //Print HashMap
	    System.out.println(capitalCities);
	    
	    //Get Item
	    System.out.println(capitalCities.get("England"));
	    
	    //Remove item
	    capitalCities.remove("England");
	    System.out.println(capitalCities);
	    
	    //Clear the entire HashMap
	    //capitalCities.clear();
	    
	    //Size
	    System.out.println(capitalCities.size());
	    
	    // Print keys
	    for (String i : capitalCities.keySet()) {
	      System.out.println(i);
	    }
	    
	    // Print values
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
	    }
	}
}
