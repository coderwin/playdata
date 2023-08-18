package oop.polymorphism;

public abstract class Sender {
	String name;
	Sender(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	public void send() {
//		
//	}
	
	// 쓰는 게 없어요
	public abstract void send();
	
}

