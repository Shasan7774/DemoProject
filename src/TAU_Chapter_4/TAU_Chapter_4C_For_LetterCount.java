package TAU_Chapter_4;

import java.util.Scanner;

public class TAU_Chapter_4C_For_LetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter input text");
		Scanner scr = new Scanner (System.in);
		String inputText = scr.next();
		scr.close();
		
		boolean letterFound = false;
		
		for(int i=0; i<inputText.length();i++) {
			
			char currentLetter = inputText.charAt(i);
			if(currentLetter=='A' || currentLetter=='a') {
			letterFound =true;
			}
		}
		if(letterFound) {
			System.out.println("A is here--" + inputText.indexOf('a'));
			
		}
		else {
			System.out.println("A is NOT here");
		}

	}

}
