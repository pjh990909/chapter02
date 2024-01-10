package com.javaex.ex20;

public abstract class Shape {

	private String fillColor;
	private String lineColor;

	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	public void draw() {
	   System.out.println("Shape.draw()");
	   
	}
	//면저구하는 메소드
    public abstract double area();

}
