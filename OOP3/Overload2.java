public class Overload2 {

  public void square(int num) {
    System.out.println("Square of int: " + (num * num));
  }

  public void square(double num) {
    System.out.println("Square of double: " + (num * num));
  }

  public void square() {
    System.out.println("There's nothing to see here!!!!");
  }

  public static void main(String[] args) {
    Overload2 obj = new Overload2();
    obj.square(5); // Calls the int version
    obj.square(5.5); // Calls the double version
    obj.square(); // Calls the no-argument version
  }
}
