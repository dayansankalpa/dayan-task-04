package com.wlv.unitTesting;


public class Traingles {
	public double base;
	private double height;
	
	public Traingles(double width, double height) {
		this.base = width;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return (base*height)/2;
	}
	public double getDiagonalLength() {
		return Math.sqrt((base*base)+(height*height));
	}

	public void setArea(double base, double height ) {

	}

}

