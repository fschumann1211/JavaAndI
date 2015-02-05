/**
 * 
 */
package Kap15;
import java.util.*;

/**
 * @author frank
 * @version 0.15.10
 *
 */
public class BeispielSchleife {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
	    int zaehler, limit;

	    System.out.println( "Geben Sie den Anfangswert ein:" );
	    zaehler     = scan.nextInt();

	    System.out.println( "Geben Sie den Endwert ein:" );
	    limit     = scan.nextInt();

	    while ( zaehler <= limit )   // kleiner-oder-gleich-Operator
	    {
	      System.out.println( "Zaehler ist:" + zaehler );
	      zaehler = zaehler + 1;
	    }
	    System.out.println( "Schleife beendet" );
	    scan.close();
	}

}
