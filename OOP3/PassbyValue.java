public class PassbyValue {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int sq = square(a);
    System.out.println("Square of a is: " + a);
    System.out.println(b);

  }

  public static int square(int x) {
    x = x * x;
    return x;
  }
}
