import java.util.*;

public class ArrMinMax {
  public int max(int[] array) {
    int max = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public int min(int[] array) {
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int size = scan.nextInt();
    int[] myArray = new int[size];

    System.out.println("Enter elements of the array:");
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = scan.nextInt();
    }

    ArrMinMax m = new ArrMinMax();
    System.out.println("Maximum value is :" + m.max(myArray));
    System.out.println("Minimum value is :" + m.min(myArray));

  }
}
