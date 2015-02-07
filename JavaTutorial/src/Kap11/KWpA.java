/**
 * 
 */
package Kap11;
import java.util.*;
//import java.lang.Math;

/**
 * @author frank
 *
 */
public class KWpA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double kwPreis, kwJahr;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie den Preis pro KWh in Cent an: ");
		kwPreis = scan.nextDouble();
		
		System.out.println("Geben Sie den Verbrauch in KWh pro Jahr an: ");
		kwJahr =scan.nextDouble();
		scan.close();
		
		System.out.println("Jahreskosten: " + (kwPreis*kwJahr/100));

	}

}
