/**
 * 
 */
package Kap17;
import java.util.*;

/**
 * @author frank
 * @version 0.17.10
 *
 */
public class Fakultaet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long n, fakultaet = 1;
		
		System.out.println("Geben Sie N ein:");
		n = scan.nextLong();
		scan.close();
		
		if ( n >= 0){
			while ( n > 1){
				fakultaet = fakultaet * n;
				n--;
			}
			if (fakultaet > 0) System.out.println("Fakultät N: " + fakultaet);
			else System.out.println("Overflow! Bitte nur kleinere Fakultäten berechnen");
		} else {
			System.out.println("N muss größer oder gleich 0 sein!");
		}
	}

}
