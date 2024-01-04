package com.javaex.ex07;

public class Point {

	private int x;
	private int y;
	
	public Point() {
		//메모리에 올리는 일
		System.out.println("Point()");
	}
	public Point(int x) {
		//메모리에 올리는 일
		this.x=x;
		System.out.println("Point(int x)");
	}
	public Point(int x,int y) {
		this(x);
		this.y=y;
		System.out.println("Point(int x, int y)");
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
	public void draw(){
		System.out.println("점[x="+this.x+", y="+this.y+"]을 그렸습니다.");
	}
	
	
}
