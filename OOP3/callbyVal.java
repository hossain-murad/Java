public class callbyVal {
  public static void main(String[] args) {
    int number = 10;
    System.out.println("Before method call: " + number);

    modifyValue(number);

    System.out.println("After method call: " + number);
  }

  public static void modifyValue(int num) {
    num = 20;
    System.out.println("Inside method: " + num);
  }
}
