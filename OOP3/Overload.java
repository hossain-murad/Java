public class Overload {

  public void sum(int a, int b) {
    System.out.println("Sum of two integers: " + (a + b));
  }

  public void sum(double a, double b) {
    System.out.println("Sum of two doubles: " + (a + b));
  }

  public static void main(String[] args) {

    Overload obj = new Overload();
    obj.sum(10, 20);
    obj.sum(10.5, 20.5);
  }
}
