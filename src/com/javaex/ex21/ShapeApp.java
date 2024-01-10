package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Drawable 배열만들기
		Drawable[] dArray = new Drawable[4];
		
		
	//그릴수 있는 애 Drawable	
		//사각형
		Drawable d01 = new Ractangle("빨강","빨강",10,10);
		
		d01.draw();
		//점
		Drawable d02 = new Point(2,2);
		
		d02.draw();
		//원
		Drawable d03 = new Circle("빨강","노랑",7);
		
		d03.draw();
		//삼각형
		Drawable d04 = new Triangle("파랑","검정",60,100);
				
		d04.draw();
		
		dArray[0]= d01;//사각형
		dArray[1]= d02;//점
		dArray[2]= d03;//원
		dArray[3]= d04;//삼각형
		
		for(int i=0; i<dArray.length;i++) {
			dArray[i].draw();
			
		}
		
		//사각형의 가로
		System.out.println(((Ractangle)dArray[0]).getWidth());
		
		//원의 넓이
		((Circle)dArray[2]).area();
		//전체에서 도형의 넓이를 출력
		for(int i =0;i<dArray.length;i++) {
			
			if(dArray[i] instanceof Shape) { 
				//현재 배열의 방(주소)를 따라가면 Shape이 있으면
				System.out.println(((Shape)dArray[i]).area());
			}
			
			((Shape)dArray[i]).area();
		}

	}

}
