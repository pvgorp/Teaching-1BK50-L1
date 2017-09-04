import java.util.Scanner;

class HelloYou {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // initialize the scanner with reading user input
    System.out.print("Enter your name: "); // request user input
    String yourName = scanner.next(); // read one word
    System.out.println("Hello " + yourName); // print the word that was entered by the user
  }
}