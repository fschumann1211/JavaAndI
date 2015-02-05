/**
 * 
 */
package Kap17;
import java.util.*;

/**
 * @author frank
 * @version 0.17.0
 *
 */
public class AddiereInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
	    int n, summeAlle = 0, summeGerade = 0, summeUngerade = 0;

	    System.out.println( "Geben Sie den Grenzwert ein:" );
	    n = scan.nextInt();

	    int zaehler = 0;

	    while ( zaehler <= n)
	    {
	      summeAlle = summeAlle + zaehler;
	      
	    }

	    System.out.print  ( "Summe von allen: " + summeAlle  );
	    System.out.print  ( "\tSumme der geraden: " + summeGerade );
	    System.out.println( "\tSumme der ungeraden: " + summeUngerade  );


	}

}
