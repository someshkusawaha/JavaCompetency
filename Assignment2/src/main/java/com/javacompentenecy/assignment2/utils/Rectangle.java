package com.javacompentenecy.assignment2.utils;

public class Rectangle {

	Integer length;

	Integer width;

	public Rectangle(Integer length,Integer width) {
		this.length = length;
		this.width = width;
	}

	public Integer area() {
		return length*width;
	}
}
