public class Cirle {
  double radius;
  public double findArea(){
    return Math.PI * radius * radius;
  }
  public double findArea(double radius){
    return Math.PI * radius * radius;
  }
  public void setRadius(double r){
    radius = r;
  }
  public double getRadius(){
    return radius;
  }
  public void show(){
    System.out.println("这是园方法");
  }
}
