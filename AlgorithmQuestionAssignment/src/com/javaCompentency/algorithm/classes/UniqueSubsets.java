package com.javaCompentency.algorithm.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueSubsets {

	/** Unique Subsets 
	8. Given an array arr[] of integers of size N that might contain duplicates, the task is to find all 
	possible unique subsets. 
	Note: Each subset should be sorted. 
	Your Task: 
	Your task is to complete the function AllSubsets() which takes the array arr[] and N as input 
	parameters and returns list of all possible unique subsets in lexicographical order.
	**/
	
	public static List<List<Integer>> uniqueSubsets(Integer[] input){
		// To store the resulting subsets
		List<Integer> v = Arrays.asList(input);
		Set<List<Integer>> res = new HashSet<>();
		List<Integer> subset;
		int size = v.size();

		// Finding 2^N
		int N = 1 << size;
		for (int i = 1; i < N; i++) {
			int bit = i;
			subset = new ArrayList<Integer>();
			int pos = 0;

			while (bit != 0) {
				// If the bit is set, insert
				// it into the subset
				if ((bit & 1) != 0) {
					subset.add(v.get(pos));
				}
				pos++;
				bit >>= 1;
			}
			res.add(subset);
		}

		List<List<Integer>> result = new ArrayList<>();
		for (List<Integer> u : res)
			result.add(u);
		return result;
	}
}
