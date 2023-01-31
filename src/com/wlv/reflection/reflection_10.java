package com.wlv.reflection;

import java.lang.ProcessHandle.Info;
import java.lang.reflect.*;

/*Returns the class of the caller of the method calling this method,ignoring 
frames associated with java.lang.reflect.Method.invoke()and its implementation. 
*/

public class reflection_10 {

  public static void main(String [] args) throws Exception{
    Simple s = new Simple();
    Method m = s.getClass().getDeclaredMethod("SetB", Info.class);
    m.setAccessible(true);
    m.invoke(s, 76);
    System.out.println(s);
    
  }
}
 