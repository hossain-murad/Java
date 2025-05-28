class SimpleCalculator {
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }
}

public class Polimorphism2 {
  public static void main(String[] args) {
    SimpleCalculator sc = new SimpleCalculator();
    System.out.println(sc.add(1, 2)); // Output: 3
    System.out.println(sc.add(1, 2, 3)); // Output: 6
  }
}
