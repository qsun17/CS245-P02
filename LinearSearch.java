//package edu.usfca.cs.cs245;

//import java.util.*;//I add this to every class because I'm not able to built the project by using eclipse, instead I used terminal.

public class LinearSearch implements Practice2Search{
	
	public LinearSearch() {}
	
	
	public String searchName() {
		
		return "LS";
	}
	
	
	/*
	you should be returning the index not the search target/
	*/
	public int search(int [] arr, int target) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == target) {
				return target;
			}
		}
		return 0;
	}
	
	
	
}
