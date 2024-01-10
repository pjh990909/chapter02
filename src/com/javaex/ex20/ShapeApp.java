package com.javaex.ex20;

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
		
		//사각형의 가로값 가져오기
		System.out.println(((Ractangle)sArray[0]).getWidth());
		
		//원의 반지름 가져오기
		System.out.println(((Circle)sArray[1]).getRadius());
		
		//전체 면적구하기
		for(int i=0;i<sArray.length;i++) {
			System.out.println(sArray[i].area());
		}

	}

}
