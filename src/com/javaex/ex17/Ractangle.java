package com.javaex.ex17;

public class Ractangle {
	
	private String lineColor;
	private String fillColor;
	private int width;
	private int height;
	public final int length = 3; 
	
	public Ractangle() {
		
	}

	public Ractangle(String lineColor, String fillColor, int width, int heiget) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.width = width;
		this.height = heiget;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
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

	public void setHeiget(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Ractangle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", width=" + width + ", heiget="
				+ height + "]";
	}
	
	public void draw() {
	    // 사각형을 시각화 하는 복잡한 로직작동
	    System.out.println("====사각형을 그렸습니다=========");
	    System.out.println("가로:" + width);
	    System.out.println("세로:" + height);
	    System.out.println("면색:" + fillColor);
	    System.out.println("선색:" + lineColor);
	    System.out.println("============================");
	}
	
	
	
	
	
	

}
