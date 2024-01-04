package com.javaex.ex10;

public class TV {

	private int channel;
	private int volume;
	private boolean power;

	public TV() {

	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;

	}

	public int getChannel() {
		
		return channel;
	}

	public int getVolume() {
		
		return volume;
	}

	public boolean getPower() {
		
		return power;
	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	public void power(boolean on) {
		if(on==true) {
			power = true;
		}else {
			power = false;
		}
	}
	public void channel(int channel) {
		if(channel>=256) {
			this.channel = 255;
		}else if(channel<1) {
			this.channel = 1;
		}else {
			this.channel=channel;
		}
	}
	public void channel(boolean up) {
		if(up==true) {
			this.channel = this.channel+1;
			if(this.channel>255) {
				this.channel = 255;
			}
		}else {
			this.channel = this.channel-1;
			if(this.channel<1) {
				this.channel = 1;
			}
		}
	}
	public void volume(int volume) {
		if(volume>100) {
			this.volume = 100;
		}else if(volume<0) {
			this.volume = 0;
		}else {
			this.volume = volume;
		}
	}
	public void volume(boolean up) {
		if(up==true) {
			this.volume = this.volume+1;
			if(this.volume>100) {
				this.volume = 100;
			}
		}else {
			this.volume = this.volume-1;
			if(this.volume<0) {
				this.volume = 0;
			}
		}
	}
	public void status() {
		System.out.println("채널:"+this.channel+"  볼륨:"+this.volume+"  파워:" +this.power);
	}
	
	
	

}
