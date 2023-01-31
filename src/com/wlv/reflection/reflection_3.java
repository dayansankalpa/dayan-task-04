package com.wlv.reflection;

public class reflection_3 {

	// Explores the Reflection API.
	
	/* It demonstrates how to find out which class an object is an instance of.
	   getClass returns an object belonging to the class called Class.
	   The getName method of the Class object is called to find out just the class
	 */
	
  public static void main(String[] args) {
    Simple s = new Simple();
    System.out.println("class =" + s.getClass());
    System.out.println("class name =" + s.getClass().getName());
    
}
}



