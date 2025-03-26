import java.util.*;

public class BooleanDemo {
  public static void main(String[] args) {
    System.out.println("Enter a number: and (negative number to exit)");
    int next, sum = 0;
    boolean numbersleft = true;
    Scanner scan = new Scanner(System.in);
    while (numbersleft) {
      next = scan.nextInt();
      if (next < 0) {
        numbersleft = false;
      } else {
        sum += next;
      }
    }
    System.out.println("The sum is " + sum);
  }
}
