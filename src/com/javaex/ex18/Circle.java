package com.javaex.ex18;

public class Circle extends Shape{
	
	private int radius;

	public Circle() {
		super();
	}

	public Circle(String fillColor,String lineColor,int radius) {
		super(fillColor,lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + " fillColor=" + getFillColor() + ", lineColor=" + getLineColor() +"]";
	}
	
	
	
	
	
	
	
	
	
	

}
