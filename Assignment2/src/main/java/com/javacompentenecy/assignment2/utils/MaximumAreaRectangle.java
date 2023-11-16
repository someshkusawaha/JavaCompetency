package com.javacompentenecy.assignment2.utils;

public class MaximumAreaRectangle {

	/**Maximum Area Rectangle 
	10. Given N  pairs of rectangles, where each pair denotes the length L and breadth B of the 
	ith rectangle. The task is to return the maximum area of the rectangle. 
	User Task: Your task is to complete the function calculate_Area() which returns maximum 
	area. Use area() function in Rectangle class.
	**/
	
	public static int maximumAreaRectangle(Rectangle[] input){
		int area = 0;
		int max=0;
		for(int i=0; i<input.length;i++) {
			area = input[i].area();
			if(max<area) {
				max=area;
			}
		}
		return max;
	}
}
