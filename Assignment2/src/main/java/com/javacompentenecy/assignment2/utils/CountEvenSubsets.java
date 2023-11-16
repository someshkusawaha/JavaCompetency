package com.javacompentenecy.assignment2.utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountEvenSubsets {

	/**Count subsets having distinct even numbers 
	9. Given a set of n numbers. The task is to count all the subsets of the given set which only 
	have even numbers and all are distinct. 
	Note: By the property of sets, if two subsets have the same set of elements then they are 
	considered as one. For example: [2, 4, 8] and [4, 2, 8] are considered to be the same. 
	Your Task:  
	You don't need to read input or print anything. Your task is to complete the 
	function countSubsets() which takes the array a[] and its size n as inputs and returns the 
	Count of possible subsets.
	 **/

	public static List<List<Integer>> countEvenSubsets(Integer[] input){
		// To store the resulting subsets
		List<Integer> v = Arrays.asList(input).stream().filter(i->i%2==0).distinct().collect(Collectors.toList());
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
