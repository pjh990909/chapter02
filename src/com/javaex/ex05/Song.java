package com.javaex.ex05;

public class Song {
	
	private String title;
	private String airtist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAirtist(String airtist) {
		this.airtist=airtist;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setTrack(String track) {
		this.track=track;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAirtist() {
		return this.airtist;
	}
	public String getAlbum() {
		return this.album;
	}
	public String getComposer() {
		return this.composer;
	}
	public int getYear() {
		return this.year;
	}
	public String getTrack() {
		return this.track;
	}
	public void showinfo() {
		System.out.println(this.airtist +","+ this.title +"("+this.album +","+ this.track + "," + this.composer + ")");
	}
	
	
	
	
	
	
	
	
	

}
