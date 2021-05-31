package com.spring.first;

public class Speaker {
	//세개다 getter만 존재 
	private String brand;
	private int maxVolume;
	private int currentVolume;
		
	
	public int getMaxVolume() {
		return maxVolume;
	}

	public String getBrand() {
		return brand;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	
	
	//생성자
	public Speaker(String brand, int maxVolume) {
		super();
		this.brand = brand;
		this.maxVolume = maxVolume;
		System.out.printf("--%s 스피커 생성--", this.brand);
	}
	
	
	
	
	//max볼륨까지만 올라가야한다.
	public void volumeUp() {
		if(maxVolume>currentVolume) {
			currentVolume++;			
		}
	}
	
	public void volumeDown() {
		if(currentVolume>0) {
		   currentVolume--;			
		}
	}
	
	
	
}
