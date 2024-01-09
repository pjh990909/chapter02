package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArray = new Shape[3];
		
		Shape s01 = new Ractangle("검정","노랑",20,20);
		Shape s02 = new Circle("빨강","검정",10);
		Shape s03 = new Triangle("빨강","파랑",9,10);
		
		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;
		
		for(int i =0;i<sArray.length;i++) {
			sArray[i].draw();
		}
		
		
		

	}

}
