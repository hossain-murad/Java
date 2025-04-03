import java.util.*;

public class FormalActual {
  public static void main(String[] args) {
    int next;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a number: ");
    next = kb.nextInt();
    kb.close();
    System.out.println(doubleVal(next));
  }

  public static int doubleVal(int x) {
    return x * 2;
  }
}
