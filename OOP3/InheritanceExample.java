class Teacher {
  String designation = "Professor";
  String collegeName = "Woosong University";

  void does() {
    System.out.println("Teaching Subject...");
  }
}

public class InheritanceExample extends Teacher {
  String mainSubject = "Java";

  void does() {
    System.out.println("Teaching " + mainSubject);
  }

  public static void main(String args[]) {
    InheritanceExample obj = new InheritanceExample();
    System.out.println("Designation: " + obj.designation);
    System.out.println("College Name: " + obj.collegeName);
    System.out.println("Main Subject: " + obj.mainSubject);
    obj.does();
  }

}
