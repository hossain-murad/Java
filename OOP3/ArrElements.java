import java.util.*;

public class ArrElements {
  public static void displayElements(int ele) {
    System.out.println("Received Element: " + ele);
  }

  public static void displayArray(int arr[]) {
    System.out.println("Received Array: " + Arrays.toString(arr));
  }

  public static void main(String[] args) {
    int Arr[] = { 1, 2, 3, 4, 5 };
    displayElements(Arr[2]);
    displayArray(Arr);
  }
}
