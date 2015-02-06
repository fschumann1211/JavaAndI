/**
 * 
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.13
 *
 */
public class Kaufhaus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Waren         waren        = new Waren( "Tube", 1.40 );
	    Lebensmittel  lebensmittel = new Lebensmittel ( "Milch", 0.95, 690 );
	    Spielwaren    spiel        = new Spielwaren  ( "Lego", 24.45, 8 );
	    Buecher       buch         = new Buecher ( "Emma", 14.95, "Austin" );

	    waren.anzeigen();

	    lebensmittel.anzeigen();

	    spiel.anzeigen();
	    System.out.println
	      ("Die Steuer betraegt: " + spiel.berechneSteuer() + "\n" );

	    buch.anzeigen();
	    System.out.println
	      ("Die Steuer betraegt: " + buch.berechneSteuer() + "\n" );

	}

}
