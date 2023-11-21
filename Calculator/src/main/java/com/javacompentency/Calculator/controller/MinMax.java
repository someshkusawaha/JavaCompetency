package com.javacompentency.Calculator.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="MinMax",description="",required = true)
public class MinMax {
	
	private List<Integer> numbers;

	@Schema(example="[10,-5,7,15,-7,-6,16,19,-15,9]",description="",required = true)
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
