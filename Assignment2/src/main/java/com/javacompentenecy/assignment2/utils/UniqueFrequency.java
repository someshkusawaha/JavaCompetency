package com.javacompentenecy.assignment2.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueFrequency {

	/*
	 21. Unique Number of Occurrences 
	Given an array arr of N integers, the task is to check whether the frequency of the elements 
	in the array is unique or not. Or in other words, there are no two distinct numbers in array 
	with equal frequency. If all the frequency is unique then return true, else return false. 
	Your task: 
	You don't need to read input or print anything. Your task is to complete the function 
	isFrequencyUnique() which take integer N and array arr of size N as arguments, and returns 
	a boolean.
	 */
	public static boolean checkUniqueFrequency(Integer[] input) {
		
		int cnt=0;
		List<Integer> feq = new ArrayList<>();
		for(Integer i: Arrays.asList(input).stream().distinct().collect(Collectors.toSet())) {
			for(int j=0;j<input.length;j++) {
				if(i.equals(input[j])) {
					cnt++;
				}
			}
			feq.add(cnt);
			cnt=0;
		}
		
		if(feq.size()>feq.stream().distinct().collect(Collectors.toSet()).size()) {
			return false;
		}else {
			return true;
		}
		
	}
}
