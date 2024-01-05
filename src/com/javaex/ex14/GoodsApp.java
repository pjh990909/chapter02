package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘",400000);
		System.out.println(camera.toString());
		camera.showinfo();
		
		Goods computer = new Goods("LG그램",900000);
		System.out.println(computer.toString());
		computer.showinfo();
		
		Goods cup = new Goods("머그겁",2000);
		System.out.println(cup.toString());
		cup.showinfo();
		
		Goods[] goodsArray = new Goods[5];
		
		goodsArray[0] = camera;		
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		int count = 0;
		//System.out.println(camera.getName());
		//System.out.println(goodsArray[0].getName());
		
		for(int i =0;i<goodsArray.length;i++) {
			if(goodsArray[i] != null) {
				goodsArray[i].showinfo();
				count = count+1;
				System.out.println(count);
			}
		}System.out.println(count);
		
		
		

	}

}
