package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1 = new Song();
		
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수 작곡");
		s1.setYear(2010);
		s1.setTrack("3번 track");
		
		s1.showinfo();
		
		Song s2 = new Song();
		
		s2.setTitle("거짓말");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Always");
		s2.setComposer("G-DRAGON 작곡");
		s2.setYear(2007);
		s2.setTrack("2번 track");
		
		s2.showinfo();
		
		Song s3 = new Song();
		
		s3.setTitle("벚꽃엔딩");
		s3.setArtist("버스커버스커");
		s3.setAlbum("버스커버스커1집");
		s3.setComposer("장범준 작곡");
		s3.setYear(2012);
		s3.setTrack("4번 track");
		
		s3.showinfo();
		
		
		
		
		
		
		

	}

}
