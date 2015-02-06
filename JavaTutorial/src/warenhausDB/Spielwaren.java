/**
 * 
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.13
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

	/* (non-Javadoc)
	 * @see warenhausDB.Waren#getBeschreibung()
	 */
	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return super.getBeschreibung();
	}

	/* (non-Javadoc)
	 * @see warenhausDB.Waren#setBeschreibung(java.lang.String)
	 */
	@Override
	public void setBeschreibung(String beschreibung) {
		// TODO Auto-generated method stub
		super.setBeschreibung(beschreibung);
	}

	/**
	 * @return the mindestalter
	 */
	public int getMindestalter() {
		return mindestalter;
	}

	/**
	 * @param mindestalter the mindestalter to set
	 */
	public void setMindestalter(int mindestalter) {
		this.mindestalter = mindestalter;
	}

}
