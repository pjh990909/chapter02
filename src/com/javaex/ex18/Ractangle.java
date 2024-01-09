package com.javaex.ex18;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle() {
		super();
	}

	public Ractangle(String fillColor,String lineColor,int width, int height) {
		/*
		super();
		super.setFillColor(fillColor);
		super.setLineColor(lineColor);
		this.width = width;
		this.height = height;
		*/
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height +" filColor=" + getFillColor() + ", lineColor=" + getLineColor() + "]";
	}
	
	
	
	
	
	
	
	

}
