//package edu.usfca.cs.cs245;

//import java.util.*;  //I add this to every class because I'm not able to built the project by using eclipse, instead I used terminal.

public class BinaryIterativeSearch implements Practice2Search{
	
	
	/*
	You are using too much whitespace
	Be consistent with how you use it and try not to have extra whitespace that isn't
	meaningfully seperating anything.
	*/
	public BinaryIterativeSearch() {
		
	}
	
	public String searchName() {
	
		return "BIS";
		
		
	}
	
	
	
	
	public int search(int [] arr, int target) {
		
		int min = 0;
		int max = arr.length - 1;
		int mid;
		while (min <= max) {
			mid = (min + max)/2;
			if (arr[mid] == target) {
				return arr[mid];
			}
			if (arr[mid] > target) {
				max = mid - 1;
			}
			else
				min = mid + 1;
		}
		return -1;
		
	}
	
	
	
	
	
}
