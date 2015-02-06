/**
 * 
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.10
 *
 */
public class Spielwaren extends Waren implements Besteuerbar {
	private int mindestalter;
	/**
	 * 
	 */
	public Spielwaren(String beschreibung, double preis, int mindestalter) {
		super(beschreibung,preis);
		this.mindestalter = mindestalter;
	}

	/* (non-Javadoc)
	 * @see warenhausDB.Besteuerbar#berechneSteuer()
	 */
	@Override
	public double berechneSteuer() {
		return this.getPreis()*TAX;
	}

	/* (non-Javadoc)
	 * @see warenhausDB.Waren#anzeigen()
	 */
	@Override
	public void anzeigen() {
		// TODO Scaffold for testing. Delete when done.
		super.anzeigen();
		System.out.println("Mindestalter: " + mindestalter);
	}

}
