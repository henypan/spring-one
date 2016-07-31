package com.brooklyn.entity;

public class ThreeGuysFromBK implements Market {

	public ThreeGuysFromBK() {
		System.out.println("Shopping in Three Guys from Brooklyn market");
	}

	@Override
	public void open() {
		System.out.println("Open at 7 AM");
	}

	@Override
	public void close() {
		System.out.println("Close at 8PM");
	}
	
	@Override
	public String getName() {
		return this.getClass().getName();
	}
}
