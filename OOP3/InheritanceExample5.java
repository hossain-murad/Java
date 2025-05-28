class Electronics {
  public Electronics() {
    System.out.println("Electronics constructor");
  }

  public void deviceType() {
    System.out.println("This is an electronic device");
  }
}

class Gadget extends Electronics {
  public Gadget() {
    System.out.println("Gadget constructor");
  }

  public void type() {
    System.out.println("From gadget category");
  }
}

class Mobile extends Gadget {
  public Mobile() {
    System.out.println("Mobile constructor");
  }

  public void brand() {
    System.out.println("Which is an Iphone");
  }
}

public class InheritanceExample5 {
  public static void main(String[] args) {
    Mobile m = new Mobile();
    m.deviceType();
    m.type();
    m.brand();
  }
}
