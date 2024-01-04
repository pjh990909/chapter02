package com.javaex.ex08;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1 = new Song("좋은날","아이유","Real","이민수 작곡",2010,"3번 track"); 
		System.out.println(s1.toString());
		
		Song s2 = new Song("거짓말","BIGBANG","Always","G-DRAGON 작곡",2007,"2번 track");
		System.out.println(s2.toString());
		
		Song s3 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준 작곡",2012,"4번 track");
		System.out.println(s3.toString());
		
		s1.showinfo();
		s2.showinfo();
		s3.showinfo();

	}

}
