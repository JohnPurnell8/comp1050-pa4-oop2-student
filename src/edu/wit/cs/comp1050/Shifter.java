package edu.wit.cs.comp1050;

import java.util.*;

/**
 * shifter class for PA4a, carries out the processes of string
 * modification; shifting, finding substrings, etc.
 * 
 * @author norrisb1
 *
 */
public class Shifter {
	
	/**
	 * Number of letters in the English alphabet
	 */
	public static final int NUM_LETTERS = ('z' - 'a') + 1;
	String s = "";
	
	
	/**
	 * Initializes the shifter
	 * 
	 * @param s encrypted string
	 */
	public Shifter(String s) {
	    this.s = s;
		// replace with your code
	}
	
	/**
	 * Returns the result of shifting
	 * by a supplied amount
	 * 
	 * @param n number of places to shift 
	 * @return shifted string
	 */
	public String shift(int n) {
	    int charVal = 0;
	    char stringChar;
	    
	    //create separate cases for uppercase / lowercase
	    String newString = "";
	    
	    for(int i = 0; i < s.length(); i++) {
	        stringChar = s.charAt(i);
	        
	        if((int)stringChar >= 65 && (int)stringChar <= 90 ) {
	            charVal = (int)stringChar + n;
	            if(charVal > 90) {
	                while(charVal > 90) {
	                    charVal -= 26;
	                }
	            }
	            else if (charVal < 65) {
	                while(charVal < 65) {
	                    charVal += 26;
	                }
	            }
	        }
	        else if((int)stringChar >= 97 && (int)stringChar <= 122 ) {
                charVal = (int)stringChar + n;
                if(charVal > 122) {
                    while(charVal > 122) {
                        charVal -= 26;
                    }
                }
                else if (charVal < 97) {
                    while(charVal < 97) {
                        charVal += 26;
                    }
                }
            }
	        else {
	            charVal = s.charAt(i);
	        }
	        stringChar = (char) charVal;
	        newString += stringChar;
	    }
		return newString; // replace with your code
	}
	
	/**
	 * Finds all shifts that contain
	 * the supplied substring
	 * 
	 * @param sub substring to find
	 * @return array of shifts (0-25) that contain the substring (in order)
	 */
	public int[] findShift(String sub) {
	    ArrayList<Integer> shifts = new ArrayList<Integer>();
	    String eqCheck = "";
	    String shiftString = "";

	    for(int s = 0; s < 26; s++) {
	        shiftString = shift(s);
	        
	        if(shiftString.indexOf(sub) != -1) {
                shifts.add(s);
                //shiftCount++;
	        }
	    }
	    
	    int[]finalArray = new int[shifts.size()];
	    
	    for (int i = 0; i < shifts.size(); i++) {
            finalArray[i] = shifts.get(i);
	    }

		return finalArray;
	}

}
