import java.util.*;

public class ArrEq3 {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 1, 2, 3, 4, 5 };

    boolean areEqual = Arrays.equals(arr1, arr2);
    System.out.println("Are arrays equal? " + areEqual);
  }

}
