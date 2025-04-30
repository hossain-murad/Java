public class ArithmaticOperator {
  public static void main(String[] args) {
    int a = 10;
    int b = 3;

    System.out.println("Addition: a + b = " + (a + b));
    System.out.println("Subtraction: a - b = " + (a - b));
    System.out.println("Multiplication: a * b = " + (a * b));
    System.out.println("Integer Division: a / b = " + (a / b));
    System.out.println("Floating Division: a / b = " + ((double) a / (double) b));
    System.out.println("Modulus: a % b = " + (a % b));

    a++; // 11
    System.out.println("After a++: a = " + a);

    ++a; // 12
    System.out.println("After ++a: a = " + a);

    a--; // 11
    System.out.println("After a--: a = " + a);

    --a; // 10
    System.out.println("After --a: a = " + a);

    a = a + 2; // 12
    System.out.println("After a = a + 2: a = " + a);

    a -= 2; // 10
    System.out.println("After a -= 2: a = " + a);

    int x = a++; // x = 10, a = 11
    System.out.println("After x = a++: x = " + x + ", a = " + a);

    x = ++a; // a = 12, x = 12
    System.out.println("After x = ++a: x = " + x + ", a = " + a);

    x = a--; // x = 12, a = 11
    System.out.println("After x = a--: x = " + x + ", a = " + a);

    x = --a; // a = 10, x = 10
    System.out.println("After x = --a: x = " + x + ", a = " + a);

    x = x + 2; // x = 12
    System.out.println("After x = x + 2: x = " + x);

    x -= 2; // x = 10
    System.out.println("After x -= 2: x = " + x);
  }
}
