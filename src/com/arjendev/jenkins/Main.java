package com.arjendev.jenkins;

public class Main {

	public static void main(String[] args) {
		
		String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
		
		// Loop over single chars
		for (char x : chars.toCharArray()) {
			
			System.out.print("Char \"" + x + "\" is number: ");
			if (isInt(x + "")) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
		}

	}
	
	/**
	 * @param character
	 * @return Boolean true or false for wheter its an integer or not
	 */
	public static boolean isInt(String character) {
		
		try {
			Integer.parseInt(character);
		}
		catch (NumberFormatException e) {
			return false;
		}
		
		return true;
		
	}

}
