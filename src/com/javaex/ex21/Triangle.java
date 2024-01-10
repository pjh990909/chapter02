package com.javaex.ex21;

public class Triangle extends Shape implements Drawable{
	

	private int width;
	private int height;
	public Triangle() {
		super();
	}
	public Triangle(String fillColor,String lineColor,int width, int height) {
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
	public int getHeigth() {
		return height;
	}
	public void setHeigth(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height +" fillColor=" + getFillColor() + ", lineColor=" + getLineColor() +"]";
	}
	public void draw() {
	    // 삼각형을 시각화 하는 복잡한 로직작동
	    System.out.println("====삼각형을 그렸습니다=========");
	    System.out.println("가로:" + width);
	    System.out.println("세로:" + height);
	    System.out.println("면색:" + getFillColor());
	    System.out.println("선색:" + getLineColor());
	    System.out.println("============================");
	}
	public double area(){
		return width*height/2;
	}
}
