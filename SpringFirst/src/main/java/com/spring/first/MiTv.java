package com.spring.first;

public class MiTv {
	
	private Speaker spaker;
	
	
	public void setSpaker(Speaker spaker) {
		this.spaker = spaker;
	}


	public MiTv() {
		System.out.println("MiTv기본생성자");
	}
	
	
	public MiTv(Speaker speaker) {
		System.out.println("MiTv speaker 생성자");
		this.spaker = speaker;
	}
	
	public void volumeUp() {
		spaker.volumeUp();
	}
	
}
