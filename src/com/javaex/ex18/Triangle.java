package com.javaex.ex18;

public class Triangle extends Shape{
	
	private int width;
	private int heigth;
	public Triangle() {
		super();
	}
	public Triangle(String fillColor,String lineColor,int width, int heigth) {
		super(fillColor,lineColor);
		this.width = width;
		this.heigth = heigth;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", heigth=" + heigth +" fillColor=" + getFillColor() + ", lineColor=" + getLineColor() +"]";
	}
	
	

}
