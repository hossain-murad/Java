import java.util.*;

public class Exam {
  public static void main(String[] args) {
    System.out.println("This Program computs the average of a list of (non-negative) exam scores.");
    double sum, next;
    int numberOfStudents;
    String answer;

    Scanner keyboard = new Scanner(System.in);

    do {
      System.out.println();
      System.out.println("Enter all the scores to be averaged.(-1 to quit)");

      sum = 0;
      numberOfStudents = 0;
      next = keyboard.nextDouble();

      while (next >= 0) {
        sum = sum + next;
        numberOfStudents++;
        next = keyboard.nextDouble();
      }
      if (numberOfStudents > 0)
        System.out.println("The average is " + (sum / numberOfStudents));
      else
        System.out.println("No scores to average.");
      System.out.println("Want to average another exam?");
      System.out.println("Enter yes or no.");
      answer = keyboard.next();

    } while (answer.equalsIgnoreCase("yes"));

  }

}
