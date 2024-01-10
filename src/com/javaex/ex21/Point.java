package com.javaex.ex21;

public class Point implements Drawable{
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
	public void draw() {
	    // wja을 시각화 하는 복잡한 로직작동
	    System.out.println("========점을 그렸습니다=========");
	    System.out.println("x:" + x);
	    System.out.println("y:" + y);
	    System.out.println("============================");
	}

}
