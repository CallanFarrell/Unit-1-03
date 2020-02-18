import java.util.Scanner;
/**
* Created by: Callan Farrell.
* Created on: Feburary 18 2020
*/

public class Einstein {
  /**
   * This program finds e in e=mc^2 in a given mass.
   */
  public static void main(String[] args) {

    System.out.println("Enter a mass in Kg.");
    final double speedoflight = 2.998 * Math.pow(10,8);
    Scanner wordScanner = new Scanner(System.in);
    final double mass = wordScanner.nextDouble();
    final double energy = (mass * Math.pow(speedoflight,2));
    System.out.println("This mass releases " + energy + "J of energy.");
   
  }
  
}