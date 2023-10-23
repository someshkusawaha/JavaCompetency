package com.javacompentency.Calculator.controller;

import java.util.List;

public class MinMax {
	
	private List<Integer> numbers;

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MinMax [numbers=");
		builder.append(numbers);
		builder.append("]");
		return builder.toString();
	}
}
