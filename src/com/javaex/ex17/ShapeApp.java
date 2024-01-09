package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle[] rArray = new Ractangle[3];
		
		Ractangle r01 = new Ractangle("파랑","빨강",5,10);
		Ractangle r02 = new Ractangle("노랑","노랑",50,100);
		Ractangle r03 = new Ractangle("빨강","노랑",52,150);
		
		rArray[0]=r01;
		rArray[1]=r02;
		rArray[2]=r03;
		
		for(int i =0;i<rArray.length;i++) {
			rArray[i].draw();
		}
		
		Circle[] cArray = new Circle[3];
		
		Circle c01 =new Circle(5,"파랑","빨강");
		Circle c02 =new Circle(9,"주황","초록");
		Circle c03 =new Circle(22,"검정","분홍");
		
		cArray[0]=c01;
		cArray[1]=c02;
		cArray[2]=c03;
		
		for(int i=0;i<cArray.length;i++) {
			cArray[i].draw();
		}
		
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 =new Triangle("빨강","파랑",6,10);
		Triangle t02 =new Triangle("노랑","검정",4,20);
	    Triangle t03 =new Triangle("분홍","초록",10,10);
		
		tArray[0]= t01;
		tArray[1]= t02;
		tArray[2]= t03;
		
		for(int i=0;i<tArray.length;i++) {
			tArray[i].draw();
		}

	}

}
