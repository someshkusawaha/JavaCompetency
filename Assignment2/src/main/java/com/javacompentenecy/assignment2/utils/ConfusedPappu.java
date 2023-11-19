package com.javacompentenecy.assignment2.utils;

public class ConfusedPappu {

	/** Confused pappu 
	7. Pappu is confused between 6 & 9. He works in the billing department of abc company and 
	his work is to return the remaining amount to the customers. If the actual remaining amount 
	is given we need to find the maximum possible extra amount given by the pappu to the 
	customers. 
	User Task: 
	Your task is to complete the function findDiff() which takes single argument(amount) and 
	returns the answer. You need not take any input or print anything.
	**/
	
	public int confusedPappu(Integer number) {
		char[] array = number.toString().toCharArray();
		for(int i=0;i<array.length;i++) {
			if(array[i] == '9') {
				array[i]='6';
				continue;
			}
			
			if(array[i]=='6') {
				array[i]='9';
				continue;
			}
		}
		
		return Integer.valueOf(new String(array))-number;
	}
}
