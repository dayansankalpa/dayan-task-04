package com.wlv.unitTesting;
import static com.wlv.unitTesting.KUnit.*;

public class TestSimple {
	
	void checkConstructorAndAccess() {
		Simple s = new Simple (3, 4);
		checkEquals(s.getB(),3);
		checkEquals(s.getH(),4);
		checkNotEquals(s.getB(),4);
		checkNotEquals(s.getH(),5);
		
	}
	
	void checktaingleB() {
		Simple s=new Simple(3,4);
		s.taingleB();
		checkEquals(s.getB(),9);
		
	}
	
	public static void main(String[] args) {
		TestSimple ts=new TestSimple();
		ts.checkConstructorAndAccess();
		ts.checktaingleB();
		report();
		
	}

}


