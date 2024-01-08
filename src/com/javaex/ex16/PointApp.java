package com.javaex.ex16;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point(4,4);
		
		
		p.showInfo();
		p.x = 3;
		p.setX(3);
		ColorPoint cp1 = new ColorPoint("red");
		
		System.out.println(cp1.toString());
		cp1.showInfo();
		
		ColorPoint cp2 = new ColorPoint(10,10,"blue"); 
		System.out.println(cp2.toString());
		cp2.showInfo();

	}

}
