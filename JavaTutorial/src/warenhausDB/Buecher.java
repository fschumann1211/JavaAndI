/**
 * 
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.11
 *
 */
public class Buecher extends Waren implements Besteuerbar {
	private String author;

	/**
	 * @param beschreibung
	 * @param preis
	 * @param author
	 */
	public Buecher(String beschreibung, double preis, String author) {
		super(beschreibung, preis);
		this.author = author;
	}

	/**
	 * 
	 */

	/* (non-Javadoc)
	 * @see warenhausDB.Besteuerbar#berechneSteuer()
	 */
	@Override
	public double berechneSteuer() {
		return getPreis()*TAX;
	}

	/* (non-Javadoc)
	 * @see warenhausDB.Waren#anzeigen()
	 */
	@Override
	public void anzeigen() {
		// TODO Scaffold for testing. Delete when done.
		super.anzeigen();
		System.out.println("Autor: " + author);
	}

	/* (non-Javadoc)
	 * @see warenhausDB.Waren#getPreis()
	 */
	@Override
	public double getPreis() {
		return super.getPreis();
	}

	/* (non-Javadoc)
	 * @see warenhausDB.Waren#setPreis(double)
	 */
	@Override
	public void setPreis(double preis) {
		super.setPreis(preis);
	}

}
