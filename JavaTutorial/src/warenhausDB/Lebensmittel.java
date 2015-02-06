/**
 * 
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.7
 *
 */
public class Lebensmittel extends Waren {
	private double kalorien;
	
	/**
	 * 
	 */
	public Lebensmittel(String beschreibung, double preis, double kalorien) {
		super(beschreibung,preis);
		this.kalorien = kalorien;
	}
	
	public void anzeigen(){
		// TODO Scaffold for testing. Delete when done.
		super.anzeigen();
		System.out.println("Kalorien: " + kalorien);
	}

}
