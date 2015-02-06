/**
 * 
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.13
 *
 */
public class Buecher extends Waren implements Besteuerbar {
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

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

}
