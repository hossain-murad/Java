public class ArrTwoDim {
  public static void main(String[] args) {
    int[][] values = {
        { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 },
        { 11, 21, 31 }
    };

    for (int row = 0; row < 4; row++) {
      for (int col = 0; col < 3; col++)

        System.out.println(values[row][col] + " ");
    }
    System.out.println();

  }

}
