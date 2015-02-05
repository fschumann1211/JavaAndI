/**
 * 
 */
package kap19;
import java.util.*;

/**
 * @author frank
 * @version 0.19.16
 *
 */
public class Quadratwurzel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double FASTNULL = 1.0E-14;
		Scanner scan = new Scanner(System.in);
		double n;
		double estim = 1.0;
		
		System.out.println("Geben Sie einen Wert an:");
		n = scan.nextDouble();
		
		while (Math.abs(n/(estim*estim)-1) > FASTNULL){
			estim = n/(estim*2)+estim/2;
		}
		System.out.println("Die Quadratwurzel von " + n + " beträgt: " + estim);
		scan.close();

	}

}
