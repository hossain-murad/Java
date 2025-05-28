interface Fruit {
  void noramlApple();
}

interface Apple extends Fruit {
  default void apple() {
    System.out.println("This is a default apple.");
  }

}

class Orange implements Apple {
  public void noramlApple() {
    System.out.println("This is a normal apple.");
  }

  public void orangeApple() {
    System.out.println("This is an orange apple.");
  }
}

class Classwork {
  public static void main(String[] args) {
    Orange orange = new Orange();
    orange.noramlApple();
    orange.apple();
    orange.orangeApple();
  }
}
