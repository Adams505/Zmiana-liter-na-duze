import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj slowo:");
    String input = scan.nextLine();
    String output = input.substring(0, 1).toUpperCase() + input.substring(1);
    System.out.println(output);
  }
}