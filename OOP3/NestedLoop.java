public class NestedLoop {
  public static void main(String[] args) {
    int line, star;

    for (line = 1; line <= 10; line++) {
      for (star = 1; star <= line; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
