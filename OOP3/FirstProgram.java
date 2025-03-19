import java.util.*;

public class FirstProgram
{
  public static void main (String[] args)
  {
    System.out.println("Hello out there.");
    System.out.println("I will add two numbers for you");
    System.out.println("Enter two int numbers on a line");

    int n1,n2;

    Scanner kb = new Scanner(System.in);
    
    n1 = kb.nextInt();
    n2 = kb.nextInt();

    System.out.println("The sum of two numbers is: ");
    System.out.println(n1+n2);

    kb.close();
  }
}
