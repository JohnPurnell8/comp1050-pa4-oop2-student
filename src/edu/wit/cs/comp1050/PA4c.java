package edu.wit.cs.comp1050;

import java.util.Scanner;
import java.util.ArrayList;

//TODO: document this class
public class PA4c {
	
	/**
	 * Removes all duplicate values
	 * from the supplied list
	 * 
	 * @param list list from which to remove repeated elements
	 */
	public static void removeRepeated(ArrayList<Integer> list) {
		// replace with your code
		for(int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				int a = list.get(i), b = list.get(j);
				if(a == b) {
					list.remove(j);
					j--;
				}
			}
		}
	}

	/**
	 * Reads numbers from the keyboard and
	 * outputs the list of distinct values
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		//replace with your code
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> user = new ArrayList<Integer>();
		int count = 0;
		System.out.print("Enter integers: ");
		while(keyboard.hasNextInt()) {
			user.add(keyboard.nextInt());
			count++;
		}
		if(count == 0) {
			System.out.println("No values entered.");
			System.exit(0);
		}
		removeRepeated(user);
		System.out.print("The distinct integer(s): ");
		for(int i = 0; i < user.size(); i++) {
			System.out.print(user.get(i));
			if(user.size() > 1 && i != user.size() - 1) {
				System.out.print(" ");
			}
			if(i == user.size() - 1) {
				System.out.printf("%n");
			}
		}
	}
}

