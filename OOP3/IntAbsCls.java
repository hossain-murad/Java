interface Device {
  void turnOn();

  void turnOff();

  void reset();

  default void getStatus() {
    System.out.println("Status: No detailed status available.");
  }

  static void deviceInfo() {
    System.out.println("Devices must implement turnOn, turnOff, and reset methods.");
  }
}

abstract class SmartDevice implements Device {
  String deviceName;

  // Constructor in abstract class
  SmartDevice(String name) {
    this.deviceName = name;
    System.out.println("SmartDevice '" + name + "' initialized.");
  }

  public void turnOn() {
    System.out.println(deviceName + " is now ON.");
  }

  public void turnOff() {
    System.out.println(deviceName + " is now OFF.");
  }
}

// Concrete class extending abstract class and implementing interface
class SmartPhone extends SmartDevice {
  SmartPhone(String name) {
    super(name);
  }

  @Override
  public void reset() {
    System.out.println(deviceName + " is resetting to factory settings...");
  }

  @Override
  public void getStatus() {
    System.out.println(deviceName + " status: Battery 80%, Signal strong.");
  }
}

// Another concrete class
class SmartTV extends SmartDevice {
  SmartTV(String name) {
    super(name);
  }

  @Override
  public void reset() {
    System.out.println(deviceName + " is rebooting and clearing cache...");
  }

  @Override
  public void getStatus() {
    System.out.println(deviceName + " status: Volume 20, App: YouTube.");
  }
}

public class IntAbsCls {
  public static void main(String[] args) {
    Device.deviceInfo(); // Static method call from interface

    System.out.println("\n--- SmartPhone ---");
    Device phone = new SmartPhone("Pixel 8");
    phone.turnOn();
    phone.getStatus();
    phone.reset();
    phone.turnOff();

    System.out.println("\n--- SmartTV ---");
    Device tv = new SmartTV("Samsung QLED");
    tv.turnOn();
    tv.getStatus();
    tv.reset();
    tv.turnOff();
  }
}
