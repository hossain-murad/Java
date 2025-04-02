import java.util.*;

public class GreatestRoses {
  public static List<Boolean> greatestRoses(int[] roses, int extraRoses) {
    int maxOriginal = Arrays.stream(roses).max().getAsInt();
    List<Boolean> result = new ArrayList<>();
    for (int num : roses) {
      result.add(num + extraRoses >= maxOriginal);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(greatestRoses(new int[] { 2, 3, 5, 1, 3 }, 3));
    System.out.println(greatestRoses(new int[] { 4, 2, 1, 1, 2 }, 1));
    System.out.println(greatestRoses(new int[] { 12, 1, 12 }, 10));
  }
}
