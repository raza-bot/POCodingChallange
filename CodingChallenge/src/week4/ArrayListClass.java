package week4;

import java.util.ArrayList;

public class ArrayListClass {
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> brothers = new ArrayList<>(); 
		ArrayList<String> sisters = new ArrayList<>();
		brothers.add("Raza"); 
		brothers.add("Nadeem"); 
		
		sisters.add("Zarghona"); 
		sisters.add("Nilofar"); 
		
		
		System.out.println(brothers.get(0));
		System.out.println(brothers.contains("Raza"));		
		System.out.println(brothers.addAll(sisters));
		System.out.println(brothers);
		
		System.out.println(brothers.equals(brothers));
		System.out.println(brothers.indexOf("Raza"));
		
	}
	

}
