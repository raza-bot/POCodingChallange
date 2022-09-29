package week4;
import java.util.Arrays;
import java.util.Collections;

public class CodingChallenge {
	
	
	/**
	 * 
	 * @param N: number of rows in arr
	 * @param arr: Array containing 3 digits sub arrays. 
	 * @return: Array of second max elements 
	 */
	public static int[] secondMax(int N, int[][] arr) {
		
		int[] result = new int[N]; 
		for (int i = 0; i < N; i++) {
			int[] temp = arr[i]; 
			Arrays.sort(temp);
			result[i] = temp[1]; 
		}
		
		return result; 
	}
	
	// sum digits in a string
	public static int sumDigits(String s) {
		
		int sum = 0; 
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				sum = sum + Character.getNumericValue(s.charAt(i));  	
			}
		}
		
		return sum; 
	}

	
	//remove vowel from a string 
	public static String removeVowel(String s) {
		return s.replaceAll("[aoieuAOIEU]+", ""); 
	}
	
	//apply operations on an integer based on element in an array of operations
	public static int finalValueAfterOperations(String[] operations) {
        int result = 0; 
        String s = ""; 
        
        for(int i = 0; i < operations.length; i++) {
            s = operations[i]; 
            switch(s) {
                case "++X": 
                    ++result; 
                    break; 
                case "X++": 
                    result++; 
                    break; 
                case "--X": 
                    --result; 
                    break; 
                default: 
                    result--; 
                    break; 
                    
            }
        }
        return result; 
    }
	

	//count the max number of words in a sentence of array of sentences
	public static int mostWordsFound(String[] sentences) {
        
        int result = Integer.MIN_VALUE; 
        
        for(int i = 0; i < sentences.length; i++) {
        	String[] sentence = sentences[i].split("\\s"); 
        	result = sentence.length > result ? sentence.length: result;    
        }
        return result; 
    }
	
	//count number of jewels in a stones
	public static int numJewelsInStones(String jewels, String stones) {
        
		int count = 0; 
        for(int i = 0; i < stones.length() ; i++) {
        	if (jewels.contains(""+stones.charAt(i))) {
        		count++; 
        	}
        }
        return count; 
    }
	
	//Main
	public static void main(String[] args) {
		
		//1
		System.out.println(removeVowel("Raza")); 
		
		//2
		String[] operations = {"++X","++X","X++"};
		System.out.println(finalValueAfterOperations(operations));
		
		
		//3
		String[] sentences = {"alice and bob love leetcode", 
				"i think so too",
				"this is great thanks very much"}; 
		System.out.println(mostWordsFound(sentences));
		
		//4
		String jewels = "aA", stones = "aAAbbbb"; 
		System.out.println(numJewelsInStones(jewels, stones));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		int[][] arr = {{1,2,3}, {10, 15, 5},{100,999,500}}; 
//		System.out.println(secondMax(3, arr));
//		
//		String s = "abc1234"; 
//		System.out.println(sumDigits(s));
		
//		String s = new String("This is Afghanistan. "); 
//		String t = new String("This is Afghanistan");
//		CharSequence cs = "This is Afghanistan. \t\s"; 
//		System.out.println(s.contains(cs));
//		System.out.println(s.hashCode() + ", " + cs.hashCode() 
//		+ ", " + System.identityHashCode(cs));
//		
//		System.out.println("This is %.2f".formatted(121212.0));
//		System.out.println(String.format("%x", 30));
//		System.out.println(s.indent(5));
//		System.out.println(s.indexOf('A'));
//		System.out.println(s == t);
//		s = s.intern(); 
//		t = t.intern(); 
//		System.out.println(s == t);
//		System.out.println(s.matches("[a-zA-Z\\s]+"));
//		System.out.println(s.repeat(5));
//		String str = "This is tab \t, Next New Line \n,next backspace \b,next Single Quotes \' next,Double Quotes \" ";
//        System.out.println(str);
//        System.out.println(str.translateEscapes());
//        try {
//        	
//        }finally {
//        	
//        }
//        System.out.println();
//       
		
	}
	
	
	

}
