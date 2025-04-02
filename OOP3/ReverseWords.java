import java.util.*;

public class ReverseWords {
  public static String reverseWords(String s) {
    String[] words = s.trim().split("\\s+");
    Collections.reverse(Arrays.asList(words));
    return String.join(" ", words);
  }

  public static void main(String[] args) {
    System.out.println(reverseWords("the brown fox"));
    System.out.println(reverseWords("  hello java  "));
    System.out.println(reverseWords("a nice   pen"));
  }
}
