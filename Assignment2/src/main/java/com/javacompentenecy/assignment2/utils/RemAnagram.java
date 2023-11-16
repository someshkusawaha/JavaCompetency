package com.javacompentenecy.assignment2.utils;

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
		
		int cnt=0;
		if(in1.length()>in2.length()) {
		for(int i=0;i<in1.length();i++) {
			if(!in2.contains(String.valueOf(in1.charAt(i)))) {
				cnt++;
			}
		}
		}else {
			return -1;
		}
		return cnt+1;
	}
}
