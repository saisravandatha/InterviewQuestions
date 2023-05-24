package com.interview.codedecode;

public class StringRotation {

	public static void main(String[] args) {
		
		String originalString = "decode";
		String toBeChecked = "codede";
		int rotationalCharacter = 2;
		System.out.println(CheckForRotation(originalString,toBeChecked));
		System.out.println(leftRotate(originalString,rotationalCharacter));
		System.out.println(rightRotate(originalString,rotationalCharacter));
	}

	private static String rightRotate(String originalString, int rotationalCharacter) {
		
		int partition = originalString.length() - rotationalCharacter;
		String rightRotatedString = originalString.
				substring(partition)
				+ originalString.substring(0,partition);
				
		return rightRotatedString;
	}

	
	private static String leftRotate(String originalString, int rotationalCharacter) {
		       //decode            
		String leftRotatedString = originalString.substring(rotationalCharacter)//code
				+ originalString.substring(0, rotationalCharacter);//de
		
		return leftRotatedString;
	}

	private static boolean CheckForRotation(String originalString,String toBeChecked) {
		String contactedString = originalString + toBeChecked;
		if(contactedString.contains(toBeChecked)) {
			return true;
		}
		return false;
	}

}
