/**
 * @author pvgorp
 *
 */
public class TutorialClass {
  /**
   * A non-static example method
   */
  void show() { 
    System.out.println("Hello world..."); // first line of output
    System.out.println("This is a working Java program!"); // second line of output
  }
  
  /**
   * A static example method which does not require any instantiation
   */
  public static void show2() {
    System.out.println("Hello world 2...");
    System.out.println("This is also working fine!");
  }

  /** 
   * The method which is always run by default from the CLI
   * @param args no input is relevant here
   */
  public static void main(String[] args) {
    TutorialClass hw = new TutorialClass();
    hw.show(); // call to non-static method
    
    TutorialClass.show2(); // call to static method
  }
}