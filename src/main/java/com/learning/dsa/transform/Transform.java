package com.learning.dsa.transform;

public class Transform {

	public String transform(String input) {
		String output = "";
		if(input == null || input.isEmpty()) {
			return input;
		}
		
		String[] wordsArr = input.split(" ");
		for(String word : wordsArr) {
			output += " " +transformWord(word);
		}
		return output.trim();
	}
	
	private String transformWord(String word) {
		char first = word.charAt(0);
		String remainWord = word.substring(1);
		return ("" +first).toUpperCase() +remainWord;
	}

}
