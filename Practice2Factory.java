//package edu.usfca.cs.cs245;

//import java.util.*;//I add this to every class because I'm not able to built the project by using eclipse, instead I used terminal.

public class Practice2Factory {
	
	public Practice2Search getSearch(String searchtype) {
		if (searchtype.contains("linear"))
			return new LinearSearch();
		else if (searchtype.contains("binary") && searchtype.contains("recursive"))
			return new BinaryRecursiveSearch();
		else if (searchtype.contains("binary") && searchtype.contains("iterative"))
			return new BinaryIterativeSearch();
		return null;
	}

}
