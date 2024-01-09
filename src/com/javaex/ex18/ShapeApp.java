package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle[] rArray = new Ractangle[2];
		//사각형
		Ractangle r01 = new Ractangle();
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineColor("검정");
		
		//System.out.println(r01.toString());
		
		//도형(부모)
		Shape s01 = new Shape();
		s01.setFillColor("검정");
		s01.setLineColor("노랑");
		
		//System.out.println(s01.toString());
		
		Ractangle r02 = new Ractangle("검정","파랑",40,40);
		//System.out.println(r02.toString());
		
		Circle c01 = new Circle("검정","주황",7);
		System.out.println(c01.toString());
		
		Triangle t01 = new Triangle("주황","파랑",10,15);
		System.out.println(t01.toString());
		
		
		rArray[0] = r01;
		rArray[1] = r02;
		for(int i=0; i<rArray.length;i++) {
			System.out.println(rArray[i].toString());
		}

	}

}
