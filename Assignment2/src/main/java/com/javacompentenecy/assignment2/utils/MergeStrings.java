package com.javacompentenecy.assignment2.utils;

public class MergeStrings {

	/*
	19.Merge two strings 
	Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first 
	character of S1 then the first character of S2 and so on till the strings end. 
	NOTE: Add the whole string if other string is empty. 
	Your Task: 
	You don't need to read input or print anything. Your task is to complete the 
	function merge() which takes the strings S1 and S2 as input and returns the resultant string 
	by merging both S1 and S2 alternatively starting from S1.
	*/
	
	public static String mergeStrings(String in1,String in2) {
		char[] in1array = in1.toCharArray();
		char[] in2array = in2.toCharArray();
		StringBuffer sf = new StringBuffer();
		for(int i=0,j=0,k=0;i<=(in1+in2).length();i++) {
			if(i%2==0) {
				if(j<in1array.length)
				sf.append(in1array[j]);
				j++;
			}else {
				if(k<in2array.length)
				sf.append(in2array[k]);
				k++;
			}
		}
		return sf.toString();
	}
}
