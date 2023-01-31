package  com.wlv.reflection;

public class Simple {

  public double b = 15.5;
  public double h = 8.25;
  
  public Simple() {
  }
  
  public Simple(double b, double h) {
  this.b = b;
  this.h = h;
  }

  public void traingleB() {
    this.b *= this.b;
  }
  
  public void traingleH() {
    this.h *= this.h;
  }
  
  public double getB() {
    return b;
  }

  public double getH() {
    return h;
  }
  
  public void setB(double b) {
    this.b = b;
  }
  
  public void setH(double h) {
    this.h = h;
  }
  
  public String toString() {
    return String.format("(Base:%d, Height:%d)", b, h);
  }
}

