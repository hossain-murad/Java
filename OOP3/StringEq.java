import java.util.*;
public class StringEq {
  public static void main(String[] args) {
    String s1,s2;

    System.out.println("Enter two strings: ");
    Scanner sc = new Scanner(System.in);
    s1 = sc.nextLine();
    s2 = sc.nextLine();

    if(s1.equals(s2)) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }

    if(s1.equalsIgnoreCase(s2)) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }
  }
}
