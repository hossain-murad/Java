import java.util.*;

public class MultipleBirths {
  public static void main(String[] args) {
    
    System.out.println("Enter numbrer of births: ");
    Scanner sc = new Scanner(System.in);
    int noOfBirths = sc.nextInt();

    switch(noOfBirths) {
      case 1:
        System.out.println("Congratulations");
        break;
      case 2:
        System.out.println("Twins");
        break;
      case 3:
        System.out.println("Triplets");
        break;
      case 4:
      case 5:
        System.out.println("Unbelievebale");
        System.out.println(noOfBirths +" Babies");
        break;
      default:
        System.out.println("I don't believe you");
        break;
    }
  }
}
