package com.javaex.ex23;

import java.io.IOException;

public class MyFileApp {
	
	public static void main(String[] args) {
		
		MyFile mf = new MyFile();
		//정상일때
		/*
		String str = mf.read("c:/aaa.txt");
		System.out.println(str);
		*/
		//
		/*
		String str = mf .read2("c:/aaa.txt");
		System.out.println(str);
		*/
		
		try {
			mf.read3("c:/bbbtxt");
		}catch (IOException e) {
			System.out.println("can not find file");
		}
		
		
		
	}

}
