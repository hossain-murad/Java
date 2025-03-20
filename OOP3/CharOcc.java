public class CharOcc {
  public static void main(String[] args) {
    String str = "Java is amazing";
    char targetChar = 'a';
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == targetChar) {
        count++;
      }
    }

    System.out.println("Number of 'a' in the string: " + count);
  }
}
