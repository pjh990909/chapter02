package com.javaex.ex16;

public class Point {
	
	protected int x;
	private int y;
	
	public Point() {
		System.out.println("c(0)");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("c(2)");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void showInfo() {
		System.out.println("X는 " + x + " Y는 " + y);
	}
	
	
	
	

}
