package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		Point coordinate = new Point();
		
		coordinate.setX(5);
		coordinate.setY(5);
		
		coordinate.draw();
		
		
		coordinate.setX(10);
		coordinate.setY(23);
		
		coordinate.draw(); //메모리 하나에 덮어써서 마지막 값만 남음(전 값이 안 남음)
		
		Point p1 = new Point();
		
		p1.setX(11);
		p1.setY(99);
		
		p1.draw();
		
		

	}

}
