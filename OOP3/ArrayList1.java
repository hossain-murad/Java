import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    System.out.println("Original List: " + list);

    list.replaceAll(num -> num + 1);

    System.out.println("Modified List: " + list);

  }
}
