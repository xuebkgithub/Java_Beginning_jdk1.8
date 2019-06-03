package antguigu.exer;

public class MyRectangle extends GeometricObject {
  private double width;
  private double height;

  public MyRectangle(double width, double height, String color, double weight){
    super(color, weight);
    this.setWidth(width);
    this.setHeight(height);

  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }
  public double findArea(){
    return this.getWidth() * this.getHeight();
  }
}
