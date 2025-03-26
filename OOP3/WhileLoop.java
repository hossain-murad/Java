import java.util.*;

public class WhileLoop {
  public static void main(String[] args) {
    int count = 1, number;

    System.out.println("Enter a Number: ");
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();

    while (count <= number) {
      System.out.println(count + ",");
      count++;
    }
    System.out.println("Loop Ends");
  }
}
