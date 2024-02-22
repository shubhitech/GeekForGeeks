

	import java.util.TreeMap;

	public class Main {
	    public static void main(String[] args) {
	        // Create a TreeMap without specifying generic types
	        TreeMap map = new TreeMap();

	        // Add keys and values
	        Integer key = 1;
	        String value = "Object 1";
	        map.put(key, value);
	        map.put(11, "shantanu");

	        // Retrieve value using autoboxing
	        int retrievedKey = 1;
	        //String retrievedValue = (String) map.get(retrievedKey); // Autoboxing of key to Integer

	        // Display the retrieved value
	        System.out.println("Retrieved value: " + map);
	    }
	}

	
	


