public class AgeArray {
  public static void main(String[] args) {
    int[] age = { 12, 4, 5, 2, 5 };

    System.out.println("Accessing the Array elements by index:");
    System.out.println("Age at index 0 is: " + age[0]);
    System.out.println("Age at index 1 is: " + age[1]);
    System.out.println("Age at index 2 is: " + age[2]);
    System.out.println("Age at index 3 is: " + age[3]);
    System.out.println("Age at index 4 is: " + age[4]);

    System.out.println("Accessing the Array elements with for loop");

    for (int i = 0; i < age.length; i++) {
      System.out.println("Age at index " + i + " is: " + age[i]);
    }

    System.out.println("Accessing the Array elements with for-each loop");

    for (int a : age) {
      System.out.println("Age is: " + a);
    }

    System.out.println("Accessing the Array elements with while loop");

    int i = 0;
    while (i < age.length) {
      System.out.println("Age at index " + i + " is: " + age[i]);
      i++;
    }

  }
}
