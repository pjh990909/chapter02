package com.javaex.ex16;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint() {
		System.out.println("cp(0)");
	}
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("cp(1)");
	}
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color = color;
		System.out.println("cp(3)");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "X는" + getX() + " Y는" + getY() + "색은" + color;
	}
	
	public void showInfo() {
		System.out.println("X는 " + getX() + " Y는 " + getY() + " 색깔은 " + color);
	}

}
