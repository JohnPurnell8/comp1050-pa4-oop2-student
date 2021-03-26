package edu.wit.cs.comp1050;

/**
 * part a of PA4 lab, uses shifter class to take a given string input and shift it
 * by a certain number of letters.
 * 
 * @author norrisb1
 *
 */
public class PA4a {
	
	/**
	 * Error if incorrect command-line arguments are supplied
	 */
	public static final String ERR_USAGE = "Please supply correct inputs: <encrypted string> <substring>";
	
	/**
	 * Error if shift could not be found
	 */
	public static final String ERR_NONE = "No valid shifts found.";

	/**
	 * Outputs all shifts of the encrypted string
	 * that contain the supplied substring
	 * 
	 * @param args command-line arguments: <encrypted string> <substring>
	 */
	public static void main(String[] args) {
	    //System.out.println(ERR_USAGE);
	    if(args.length == 2) {
	        Shifter shifter = new Shifter(args[0]);
	        if(shifter.findShift(args[1]).length == 0) {
	            System.out.println(ERR_NONE);
	        }
	        else {
	            for(int i = 0; i < shifter.findShift(args[1]).length; i++) {
	                if(shifter.findShift(args[1])[i] <= 9) {
	                    System.out.println("0" + shifter.findShift(args[1])[i] + ": " + shifter.shift(shifter.findShift(args[1])[i]));
	                }
	                else {
	                    System.out.println(shifter.findShift(args[1])[i] + ": " + shifter.shift(shifter.findShift(args[1])[i]));
	                }
	             }
	        }
	    }
	    else {
	        System.out.println(ERR_USAGE);
	    }

		// replace with your code
	}

}
