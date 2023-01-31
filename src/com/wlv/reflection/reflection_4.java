package com.wlv.reflection;

import java.lang.reflect.Field;


/*

  When this code is run it prints details of a single field, an integer called a with value 16.25.
  The private access modifier has stopped details of the b field from being revealed.
  This shows data hiding is working an Java is good
  at maintaining data integrity.
 */

public class reflection_4 {

  public static void main(String[] args) throws Exception{
    Simple s = new Simple();
      Field[] fields = s.getClass().getFields();
      System.out.printf("There are %d fields\n", fields.length);
      
      for(Field f : fields) {
        System.out.printf("Field name=%d\n", f.getName());
        System.out.printf("Type=%d\n",  f.getType());
        System.out.printf("Value=%d\n",  f.getDouble(s));
    }
  }
  
}


