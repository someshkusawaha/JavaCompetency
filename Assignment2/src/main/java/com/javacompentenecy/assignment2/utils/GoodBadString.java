package com.javacompentenecy.assignment2.utils;

import java.util.ArrayList;
import java.util.List;

public class GoodBadString {
	/*
	20. Good or Bad string 
	In this problem, a String S is composed of lowercase alphabets and wildcard characters i.e. 
	'?'. Here, '?' can be replaced by any of the lowercase alphabets. Now you have to classify 
	the given String on the basis of following rules: 
	If there are more than 3 consonants together or more than 5 vowels together, the String is 
	considered to be "BAD". A String is considered "GOOD" only if it is not “BAD”. 
	NOTE: String is considered as "BAD" if the above condition is satisfied even once. Else it is 
	"GOOD" and the task is to make the string "BAD". 
	Your Task: 
	You don't need to read input or print anything. Your task is to complete the function 
	isGoodorBad() which takes the String S as input and returns 0 or 1.
	*/
	public boolean isGoodBadString(String input) {
		//"bcdaeiou??"
		List<Character> list = new ArrayList<>();
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		
		int vow = 0;
		int	con = 0;
		for(int i=0;i<input.length();i++) {
			if(list.contains(input.charAt(i))) {
				vow++;
				con=0;
			}else if(input.charAt(i)!='?'){
				con++;
				vow=0;
			}else {
				con=0;
				vow=0;
			}
			
			if(vow>5) {
				return false;
			}
			if(con>3) {
				return false;
			}
		}
		return true;	
	}

}
