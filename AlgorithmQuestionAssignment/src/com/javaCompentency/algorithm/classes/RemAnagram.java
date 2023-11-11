package com.javaCompentency.algorithm.classes;

import java.util.HashMap;
import java.util.Map;

public class RemAnagram {
	/*
	15. Anagram of String 
	Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only 
	allowed operation is to remove a character from any string. Find the minimum number of 
	characters to be deleted to make both the strings anagram. Two strings are called anagram 
	of each other if one of them can be converted into another by rearranging its letters. 
	Your Task: 
	Complete the function remAnagram() which takes two strings S1, S2 as input parameter, 
	and returns minimum characters needs to be deleted.
	*/
	public static Integer remAnagram(String in1,String in2){
		char[] input = (in1+in2).toCharArray();
		int count=0;
		Map<String,Integer> mapcount = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]!=input[j]) {
					count++;
				}
			}
			mapcount.put(String.valueOf(input[i]), count);
		}
		
		
		return 0;
	}
}
