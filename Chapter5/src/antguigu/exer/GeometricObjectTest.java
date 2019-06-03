package antguigu.exer;

class GeometricObjectTest  {
  public static void main(String[] args) {
    GeometricObjectTest t = new GeometricObjectTest();

    Circle c1 = new Circle(2.3, "Green1", 1.0);
    Circle c2 = new Circle(2.3, "Green2", 1.0);

    MyRectangle m1 = new MyRectangle(1.2 ,2.1, "M1", 2);
    t.displayGeometricObject(c1);
    t.displayGeometricObject(m1);

    System.out.println(t.equalsArea(c1, c2));
    System.out.println(t.equalsArea(c1, m1));
  }
  // 判断两个对象的面积是否相等
  public boolean equalsArea(GeometricObject o1, GeometricObject o2){
    return o1.findArea() == o2.findArea();
  }
  public void displayGeometricObject(GeometricObject o1){
    System.out.println(o1.getColor() + ": " + o1.findArea());
  }
}
