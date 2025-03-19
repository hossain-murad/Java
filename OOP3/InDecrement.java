public class InDecrement {
  public static void main(String[] args) {

    int n = 3;
    int m = 4;

    System.out.println(n*++m);
    System.out.println(n*m++);
    System.out.println(n*m);
    System.out.println(n*--m);
    System.out.println(n*m--);
    System.out.println(n*m);

  }
}
