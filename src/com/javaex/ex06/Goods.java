package com.javaex.ex06;

public class Goods {

	private String name;
	private int price;

	// 생성자
	public Goods() {
		//메모리에 올리는 일(클래스를 인스턴스화)
		System.out.println("Goods()");
	}
	public Goods(String name){
		this.name=name;
		System.out.println("Goods(name)");
	}
	public Goods(String name,int price) {
		this(name);
		this.name=name;
		this.price=price;
		System.out.println("goods(name,price)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
