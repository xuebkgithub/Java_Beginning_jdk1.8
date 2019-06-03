package antguigu.exer;

public class GeometricObject {
  protected String color;
  protected double weight;

  public GeometricObject(String color, double weight) {
    this.setColor(color);
    this.setWeight(weight);
  }

  public String getColor() {
    return color;
  }

  public double getWeight() {
    return weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
  public double findArea(){
    return 0.0;
  }
}
