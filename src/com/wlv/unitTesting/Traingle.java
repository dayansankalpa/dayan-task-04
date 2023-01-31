package com.wlv.unitTesting;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Traingle {
	
	
	@Test
	public void testHeight() {
		Traingles r = new Traingles(6.25,6.25);	
		r.setHeight(2);
		assertEquals(2,r.getHeight());
	}
	
	@Test
	public void testBase() {
		Traingles r = new Traingles(25.5,25.5);	
		r.setBase(5);
		assertEquals(5,r.getBase());
	}
	
	@Test
	public void testArea() {
		Traingles r = new Traingles(25.5,6.25);
		assertEquals(79.6875,r.getArea());
	}
	

}

