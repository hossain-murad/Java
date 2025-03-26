import java.util.*;

public class DoWhile {
  public static void main(String[] args) {
    int count = 1, number;

    System.out.println("Enter a Number: ");
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();

    do {
      System.out.println(count + ",");
      count++;
    } while (count <= number);
    System.out.println("Loop Ends");
  }
}
