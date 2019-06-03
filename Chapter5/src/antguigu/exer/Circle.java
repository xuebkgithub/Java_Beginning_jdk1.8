package antguigu.exer;

public class Circle extends GeometricObject {
  private double radius;
  public Circle(double radius, String color, double weight){
    super(color ,  weight);
    this.setRadius(radius);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  public double findArea(){
    return Math.PI  * this.getRadius() * this.getRadius();
  }
}
