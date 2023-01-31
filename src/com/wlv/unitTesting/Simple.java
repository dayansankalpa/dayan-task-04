package com.wlv.unitTesting;

public class Simple {

	  public double b = 25.5;
	  public double h = 6.25;
	
	public Simple() {
	}
	
	public Simple(double b, double h) {
	this.b = b;
	this.h = h;
	}


	public void taingleB() {
		this.b *= this.b;
	}
	
	public void taingleH() {
		this.b *= this.b;
	}
	
	public double getB() {
		return b;
	}
	
	public double getH() {
		return b;
	}
	
	public void setH(double h) {
		this.h = h;
	}
	
	public String toString() {
		return String.format("(a:%d, b:%d)", b, h);
	}
}


