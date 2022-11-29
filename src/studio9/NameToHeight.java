package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Map <String,Integer> nameToHeight = new HashMap<>();

		nameToHeight.put("Sofia", 67);
		nameToHeight.put("Christina", 64);
		nameToHeight.put("Mengxi", 65);

		String input = "";
		
		while (!input.equals ("quit")) {
			System.out.println("Hey girl...who's height do you want to see? Is it a lie? You'll never know.");
			input = in.nextLine();
			System.out.println(nameToHeight.get(input));
			
		}
	}
}
		
		
	
//		for (int i =0; i < nameToHeight.size();i++) {
//			
//			if (input == "Sofia"|| input == "Christina"||input == "Mengxi") {
//				System.out.println(nameToHeight.get(input));
//				
//			}else {
//				System.out.println("not in map");
//				}
//			}
//		}
//	}
//



//if (input == "Sofia") {
//
//System.out.println(nameToHeight.get(input));
//
//}
//else if (input == "Christina"){
//	
//	System.out.println(nameToHeight.get(input));
//	
//}
//else if (input == "Mengxi"){
//	
//	System.out.println(nameToHeight.get(input));
//	
//}
//
//else {
//	
//System.out.println("not in map");
//	
//}