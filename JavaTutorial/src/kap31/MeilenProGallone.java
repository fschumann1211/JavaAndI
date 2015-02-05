/**
 * 
 */
package kap31;
import java.util.*;

/**
 * @author frank
 * @version 0.31.16
 *
 */
public class MeilenProGallone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double startMeilen, endMeilen, gallonen;
		
		System.out.println("Anfangsstand eingeben:");
		startMeilen = scan.nextDouble();
		
		System.out.println("Endstand eingeben:");
		endMeilen = scan.nextDouble();
		
		System.out.println("Gallonen eingeben:");
		gallonen = scan.nextDouble();
		
		Auto auto = new Auto(startMeilen, endMeilen, gallonen);
		
		System.out.println("Meilen pro Gallone: " + auto.berechneMPG());
		scan.close();
	}

}
