package com.javaCompentency.algorithm.classes;

import java.util.stream.Stream;

public class ZigZag {

	/*
	12. Convert array into Zig-Zag fashion 
	Given an array arr of distinct elements of size N, the task is to rearrange the elements of the 
	array in a zig-zag fashion so that the converted array should be in the below form:
	arr[0] < arr[1] > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n].
	NOTE: If your transformation is correct, the output will be 1 else the output will be 0.
	Your Task: 
	You don't need to read input or print anything. Your task is to complete the 
	function zigZag() which takes the array of integers arr and n as parameters and returns 
	void. You need to modify the array itself.
	*/
	
	public static void zigZag(Integer[] input) {
		Integer[] in = {4,3,7,8,6,2,1};
		for(int i=0;i<in.length;i++) {
			for(int j=i+1;j<in.length;j++) {
				
				if(in[i]<in[j])
					continue;
				else if(in[i]>in[j])
					continue;
				else
					continue;
			}
		}
		
		Stream.of(in).forEach(i->System.out.println(i));
	}
	
}
