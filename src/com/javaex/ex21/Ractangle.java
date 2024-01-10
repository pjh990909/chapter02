package com.javaex.ex21;

public class Ractangle extends Shape implements Drawable{
	

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
	public void draw() {
	    // 사각형을 시각화 하는 복잡한 로직작동
	    System.out.println("====사각형을 그렸습니다=========");
	    System.out.println("가로:" + width);
	    System.out.println("세로:" + height);
	    System.out.println("면색:" + getFillColor());
	    System.out.println("선색:" + getLineColor());
	    System.out.println("============================");
	}
	public double area() {
    	return width*height;
    }

}
