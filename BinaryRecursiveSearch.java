package edu.usfca.cs.cs245;

//import java.util.*; //I add this to every class because I'm not able to built the project by using eclipse, instead I used terminal.

public class BinaryRecursiveSearch implements Practice2Search{
	
	
	public BinaryRecursiveSearch() {
		
	}
	
	
	public String searchName() {
		
		return "BRS";
		
	}
	
	
	
	public int search(int [] arr, int target) {
	    return search(arr, 0, arr.length-1, target);
	}

	public int search(int [] arr, int min, int max, int target) {
	    int mid = (min + max) / 2;
	    if(max < min) {
	        return -1;
	    } 

	    if(target==arr[mid]) {
	        return mid;
	    } else if(target<arr[mid]) {
	        return search(arr, min, mid - 1, target);
	    } else {
	        return search(arr, mid + 1, max, target);
	    }
	}
	
	
	
}
