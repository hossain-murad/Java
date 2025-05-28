interface Drawable {
  void draw();

  static int cube(int x) {
    return x * x * x;
  }
}

class Rectangle implements Drawable {
  public void draw() {
    System.out.println("Drawing a rectangle");
  }
}

class Interface5 {
  public static void main(String[] args) {
    Drawable rectangle = new Rectangle();
    rectangle.draw();

    System.out.println("Cube of 3 is: " + Drawable.cube(3));
  }
}
