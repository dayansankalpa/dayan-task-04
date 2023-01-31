package com.wlv.reflection;

import java.lang.reflect.Field;

public class reflection_8 {
  
  public static void main(String[] args) throws Exception{
    Simple s = new Simple();
    Field [] fields = s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    for(Field f : fields) { 
    	f.setAccessible(true);
    	double x = f.getDouble(s);
    	x++;
    	f.setDouble(s, x);
    	System.out.println("Variable name : "+f.getName());
    	System.out.println("Datatypes of the variable :"+f.getType());
    	
    	
    	System.out.print("Access Modifiers of the variable : "+f.toString());
    	System.out.println("Value of the variable : "+f.get(fields));
    	System.out.println();
    	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *") ;
          
    }
  }

}



