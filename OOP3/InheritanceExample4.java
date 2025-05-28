class Shape {
  private double height;
  private double width;

  public Shape(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public void setValues(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public double getWidth() {
    return width;
  }
}

class Rectangle extends Shape {
  public Rectangle() {
    super(0, 0);
  }

  public Rectangle(double height, double width) {
    super(height, width);
  }

  public double getArea() {
    return getHeight() * getWidth();
  }
}

class Triangle extends Shape {
  public Triangle() {
    super(0, 0);
  }

  public Triangle(double height, double width) {
    super(height, width);
  }

  public double getArea() {
    return (getHeight() * getWidth()) / 2;
  }
}

public class InheritanceExample4 {
  public static void main(String[] args) {
    Shape s1;

    Rectangle r1 = new Rectangle();
    s1 = r1;
    s1.setValues(10, 20);
    System.out.println("Area of Rectangle: " + r1.getArea());

    Triangle t1 = new Triangle();
    s1 = t1;
    s1.setValues(15, 20);
    System.out.println("Area of Triangle: " + t1.getArea());
  }
}
