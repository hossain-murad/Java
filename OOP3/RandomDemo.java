import java.util.*;

public class RandomDemo {
  public static void main(String[] args) {

    int counter;
    Random r = new Random();

    System.out.println("Random numbers: ");
    System.out.println("***************");
    for (counter = 1; counter <= 10; counter++) {
      System.out.println(r.nextInt(200));
    }

  }
}
