import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Base Conversion Program");
    System.out.println();

    System.out.print("Please enter a base (2 – 9): ");
    int base = input.nextInt();
    System.out.println();

    // the biggest 4 digit number in a base is base^4 - 1
    int max = (int) Math.pow(base, 4) - 1;

    System.out.println("The maximum, 4-digit, base 10 number in base " + base + " is " + max + ".");
    System.out.print("Now, enter a base 10 number in the range 0 to " + max + " to convert: ");
    int number = input.nextInt();
    System.out.println();

    // split the number into 4 digits in the new base
    int digit1 = number / (int) Math.pow(base, 3);
    int leftOver = number % (int) Math.pow(base, 3);
    int digit2 = leftOver / (int) Math.pow(base, 2);
    leftOver = leftOver % (int) Math.pow(base, 2);
    int digit3 = leftOver / base;
    int digit4 = leftOver % base;

    System.out.println(number + " (base 10) = " + digit1 + digit2 + digit3 + digit4 + " (base " + base + ")");
  }
}
