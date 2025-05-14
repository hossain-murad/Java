public class ArrChar {
  public static void main(String[] args) {
    char[] c;
    c = vowels();
    for (int i = 0; i < c.length; i++)
      System.out.println(c[i]);
  }

  public static char[] vowels() {
    char[] newArray = new char[5];
    newArray[0] = 'a';
    newArray[1] = 'e';
    newArray[2] = 'i';
    newArray[3] = 'o';
    newArray[4] = 'u';
    return newArray;
  }
}
