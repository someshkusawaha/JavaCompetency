package com.javacompentenecy.assignment2.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumProductSubarray {

	/*
	30. Maximum Product Subarray 
	Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the 
	product of the maximum product subarray. 
	Your Task: 
	You don't need to read input or print anything. Your task is to complete the 
	function maxProduct() which takes the array of integers arr and n as parameters and 
	returns an integer denoting the answer. 
	Note: Use 64-bit integer data type to avoid overflow
	 */
	
	public int maxProductSubarray(Integer[] input) {
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
				
				List<Integer> finalint = new ArrayList<>();
				for(List<Integer> list:result) {
					int product=1;
					for(int i=0;i<list.size();i++) {
						product = list.get(i)*product;
					}
					finalint.add(product);
				}
				
		return finalint.stream().distinct().max((n1,n2)->n1.compareTo(n2)).get();
	}
}
