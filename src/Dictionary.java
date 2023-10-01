import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;

/**
 * The Dictionary class is a dictionary that stores words and their definition pairs in a HashMap.
 * It provides methods to load pairs from a CSV file, print the pairs,
 * and search for a specific word in the dictionary.
 * 
 * @author cstirneman
 *
 */
public class Dictionary {
	/**
     * A HashMap to store pairs. The key is the word, and the value is its definition.
     */
	private HashMap<String,String> dictionary;
	
	/**
     * Constructs a new Dictionary. Initializes the HashMap to store pairs.
     */
	public Dictionary() {
		dictionary = new HashMap<String,String>();
	}
	
	/**
     * Loads pairs from a CSV file and places it in the HashMap.
     * 
     * @throws FileNotFoundException if the file is not found.
     */
	public void loadPairs() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("DictionaryWordValuePairs.csv"));
		
		while(scan.hasNextLine()) {
			String data[] = scan.nextLine().split(",");
			System.out.println(data[0] + ": " + data[1]);
			
			dictionary.put(data[0], data[1]);
			
		}//end while loop
		scan.close();
	}//end loadPairs
	
	/**
     * Prints all word/definition pairs stored in the dictionary.
     */
	public void printPairs() {
		for(Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey()+" = "+ entry.getValue());
		}//end for loop
		
	}//end printPairs
	
	/**
     * Searches for a word in the dictionary and returns its definition with the hash code of the word.
     * Returns a message if word is not found
     *
     * @param key: the word to search for in the dictionary.
     * @return a string with the word, its definition, and the hash code of the word.
     */
	public String searchPairs(String key) {
		String value = dictionary.get(key);
	    if (value != null) {
	    	int hashKey = key.hashCode();
	        return "Key: " + key + " = " + value + ". Hash Key: " + hashKey;
	    } //end if
	    
	    else {
	        return key + " not found in the dictionary.";
	    }//end else
	    
	}//end searchPairs
	
}// end class
