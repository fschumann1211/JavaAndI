/**
 * 
 */
package kap19;
//import java.util.*;

/**
 * @author frank
 * @version 0.19.4
 *
 */
public class MillionDollarYears {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		final double INTEREST = 0.05;
		double dollars = 1000;
		int years = 0;
		
		while (dollars < 1000000.0){
			dollars = dollars + dollars*INTEREST;
			years++;
		}
		System.out.println("You need " + years + " to get $" + dollars);

	}

}
