import java.util.Random;
import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    // print my initials in block letters
    System.out.println("JJJJJJJ    SSSSSSS");
    System.out.println("   JJJ    SSS   SSS");
    System.out.println("   JJJ    SSS");
    System.out.println("   JJJ     SSSSSSS");
    System.out.println("   JJJ          SSS");
    System.out.println("JJ JJJ    SSS   SSS");
    System.out.println(" JJJJ      SSSSSSS");
    System.out.println();

    // get a 5 character string and reverse the middle 3 characters
    System.out.println("Please enter a 5-character string:");
    String word = input.nextLine();
    String middle = "" + word.charAt(3) + word.charAt(2) + word.charAt(1);
    System.out.println();

    // convert fahrenheit to celsius
    System.out.println("Please enter a number in Fahrenheit:");
    double fahrenheit = input.nextDouble();
    double celsius = (fahrenheit - 32) * 5 / 9;
    System.out.println();

    // random number between 32 and 16384
    int randomNumber = random.nextInt(16353) + 32;
    System.out.println("Random number generated. Continuing...");
    System.out.println();

    System.out.println("Your new string is " + celsius + middle + randomNumber);
  }
}
