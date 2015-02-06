/**
 * Superklasse für alle Waren
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.13
 *
 */
public abstract class Waren {
	private String beschreibung;
	private double preis;

	/**
	 * 
	 */
	public Waren(String beschreibung, double preis) {
		this.beschreibung = beschreibung;
		this.setPreis(preis);
	}
	
	public void anzeigen(){
		// TODO Scaffold for testing delete when finished
		System.out.println("Artikel: " + beschreibung + "\t" + "Preis: " + getPreis());
	}

	/**
	 * @return the preis
	 */
	public double getPreis() {
		return preis;
	}

	/**
	 * @param preis the preis to set
	 */
	public void setPreis(double preis) {
		this.preis = preis;
	}

	/**
	 * @return the beschreibung
	 */
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * @param beschreibung the beschreibung to set
	 */
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

}
