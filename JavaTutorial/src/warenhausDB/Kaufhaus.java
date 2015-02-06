/**
 * 
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.14
 *
 */
public class Kaufhaus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Waren[] inventar = new Waren[10];
		inventar[0] = new Waren( "Tube", 1.40 );
	    inventar[1] = new Lebensmittel ( "Milch", 0.95, 690 );
	    inventar[2] = new Spielwaren  ( "Lego", 24.45, 8 );
	    inventar[3] = new Buecher ( "Emma", 14.95, "Austin" );

	    inventar[0].anzeigen();

	    inventar[1].anzeigen();

	    inventar[2].anzeigen();
	    System.out.println
	      ("Die Steuer betraegt: " + ((Spielwaren) inventar[2]).berechneSteuer() + "\n" );

	    inventar[3].anzeigen();
	    System.out.println
	      ("Die Steuer betraegt: " + ((Buecher) inventar[3]).berechneSteuer() + "\n" );

	}

}
