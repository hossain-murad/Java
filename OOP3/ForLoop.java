import java.util.*;

public class ForLoop {
  public static void main(String[] args) {
    int count, number;
    System.out.println("Enter a Number: ");
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();

    for (count = 1; count <= number; count++) {
      System.out.println("Count is: " + count);
    }
    System.out.println("Loop Ends");
  }
}
