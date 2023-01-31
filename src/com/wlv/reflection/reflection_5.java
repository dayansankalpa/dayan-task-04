package com.wlv.reflection;

import java.lang.reflect.Field;

public class reflection_5 {
	
	/*
	 * this time a reference to the b field is obtained, but when it is used, a runtime
	 * exception is thrown that clearly states that members with private modifiers
	 * cannot be accessed. 
	 */

  public static void main(String[] args) throws Exception{
    Simple s = new Simple();
    
        
    Field [] fields =  s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    
    for(Field f : fields) {
      System.out.printf("field name=%s type=%s value=%d\n", 
          f.getName(), f.getType(), f.getDouble(s));
      
    }
  }
}
