import java.io.*;

/**
 * The Application class uses the Dictionary class by loading pairs
 * from a CSV file, printing the pairs, and searching for specific words in the dictionary.
 */
public class Application {
	/**
     * Instantiates a Dictionary object, loads pairs from a CSV file, and tests methods for
     * loading, printing, and searching for words.
     *
     * @param args the command-line arguments 
     * @throws FileNotFoundException: if the CSV file is not found.
     */
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Dictionary dictionary = new Dictionary();//instantiate dictonary 
		System.out.println("==========Testing the loadPairs method:==========");
		dictionary.loadPairs();//loads pairs from csv file and prints them
		
		System.out.println();
		System.out.println("==========Testing the printPairs method:===========");
		dictionary.printPairs();//prints the pairs from the hashmap
		
		System.out.println();
		//searches hashmap and returns the key, value, and hashco
		System.out.println("==========Testing searchPairs method==========");
		System.out.println(dictionary.searchPairs("meat"));
		System.out.println(dictionary.searchPairs("nigh"));
		System.out.println(dictionary.searchPairs("sap"));
		System.out.println(dictionary.searchPairs("buck"));
		System.out.println(dictionary.searchPairs("peeler"));
		
		//search for a pair that is not in the dictionary
		System.out.println(dictionary.searchPairs("Chris"));

	}//end main
	
}//end class
