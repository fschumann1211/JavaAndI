/**
 * 
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.13
 * 
 */
public class Lebensmittel extends Waren {
	private double kalorien;

	/**
	 * 
	 */
	public Lebensmittel(String beschreibung, double preis, double kalorien) {
		super(beschreibung, preis);
		this.kalorien = kalorien;
	}

	public void anzeigen() {
		// TODO Scaffold for testing. Delete when done.
		super.anzeigen();
		System.out.println("Kalorien: " + kalorien);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see warenhausDB.Waren#getBeschreibung()
	 */
	@Override
	public String getBeschreibung() {
		return super.getBeschreibung();
	}

	/**
	 * @return the kalorien
	 */
	public double getKalorien() {
		return kalorien;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see warenhausDB.Waren#getPreis()
	 */
	@Override
	public double getPreis() {
		return super.getPreis();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see warenhausDB.Waren#setBeschreibung(java.lang.String)
	 */
	@Override
	public void setBeschreibung(String beschreibung) {
		super.setBeschreibung(beschreibung);
	}

	/**
	 * @param kalorien
	 *            the kalorien to set
	 */
	public void setKalorien(double kalorien) {
		this.kalorien = kalorien;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see warenhausDB.Waren#setPreis(double)
	 */
	@Override
	public void setPreis(double preis) {
		super.setPreis(preis);
	}

}
