/**
 * 
 */
package Kap17;
import java.util.*;

/**
 * @author frank
 * @version 0.17.3
 *
 */
public class AddiereInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
	    int n, summeAlle = 0, summeGerade = 0, summeUngerade = 0;

	    System.out.println( "Geben Sie den Grenzwert ein:" );
	    n = scan.nextInt();
	    scan.close();

	    int zaehler = 0;

	    while ( zaehler <= n)
	    {
	    	summeAlle = summeAlle + zaehler;
	    	if (zaehler%2 == 0){
	    		summeGerade = summeGerade + zaehler;
	    	} else {
	    		summeUngerade = summeUngerade +zaehler;
	    	}
	    	zaehler++;
	    }

	    System.out.print  ( "Summe von allen: " + summeAlle  );
	    System.out.print  ( "\tSumme der geraden: " + summeGerade );
	    System.out.println( "\tSumme der ungeraden: " + summeUngerade  );


	}

}
