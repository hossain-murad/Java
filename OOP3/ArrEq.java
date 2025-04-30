public class ArrEq {
  public static void main(String[] args) {
    int a[] = new int[3];
    int b[] = new int[3];

    for (int i = 0; i < a.length; i++) {
      a[i] = i;
    }
    b = a;
    System.out.println(a[2] + " " + b[2]);
    a[2] = 10;
    System.out.println(a[2] + " " + b[2]);
  }
}
