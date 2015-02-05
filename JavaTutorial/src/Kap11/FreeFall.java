/**
 * 
 */
package Kap11;
import java.util.*;

/**
 * @author frank
 *
 */
public class FreeFall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double z, s;
		final double G = 9.81;
		
		System.out.println("Geben Sie die Zeit in Sekunden an:");
		z = scan.nextDouble();
		
		s= (G*z*z)/2;
		
		System.out.println("Die Entfernung beträgt: " + s);

	}

}
