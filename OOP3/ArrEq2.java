public class ArrEq2 {
  public static void main(String[] args) {
    int a[] = new int[3];
    int b[] = new int[3];

    for (int i = 0; i < a.length; i++) {
      a[i] = 0;
    }

    for (int i = 0; i < b.length; i++) {
      b[i] = 0;
    }

    if (b == a)
      System.out.println("a equals b");
    else
      System.out.println("a is not equal b");
  }
}
