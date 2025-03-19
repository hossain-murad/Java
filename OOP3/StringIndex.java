public class StringIndex {
  public static void main(String[] args) {
    String sentence = "Text prcessing is hard!";
    
    int position;
    position = sentence.indexOf("hard");

    System.out.println(sentence);
    System.out.println("012345678901234567890123");
    System.out.println("The word \"hard\" starts at index "+ position);
    sentence = sentence.substring(0, position) + "easy!";
    System.out.println("The changed string is: ");
    System.out.println(sentence);

  }
}
