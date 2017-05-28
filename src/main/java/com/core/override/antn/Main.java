package com.core.override.antn;

public class Main {
	public static void main(String[] args) {
		Car ford = new Ford();
		int speed = ford.speedLimit();
		System.out.println("Ford speed:" + speed);
	}

}
