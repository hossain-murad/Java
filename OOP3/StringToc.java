import java.util.StringTokenizer;

public class StringToc {
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("Java is very hard to learn.");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }

}
