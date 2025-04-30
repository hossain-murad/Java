public class Wrapper {
  public static void main(String[] args) {
    Integer n = 7;
    Integer f = 10;
    String a = "10";
    Integer b = Integer.parseInt(a);
    System.out.println(b);
    if (b instanceof Integer) {
      System.out.println("b is of type Integer.");
    } else {
      System.out.println("b is not of type Integer.");
    }

    Double d = n.doubleValue();
    System.out.println("The value of n is: " + n);
    System.out.println("The value of f as double: " + f.doubleValue());
    System.out.println("The value of d is: " + d);
    System.out.println("The value of n as a string: " + n.toString());
  }
}
