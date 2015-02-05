/**
 * 
 */
package kap32;

/**
 * @author frank
 * @version 0.33.14
 *
 */
public class Bankkonto {
	//   Felder
	private String kontoNummer;
	private String kontoInhaber;
	private int kontoStand;
	private int zaehler = 0;
	
	//   Konstruktoren
	/**
	 * @param kontoNummer
	 * @param kontoInhaber
	 * @param kontoStand
	 */
	public Bankkonto (String kontoNummer, String kontoInhaber, int kontoStand){
		this.kontoNummer = kontoNummer;
		this.kontoInhaber = kontoInhaber;
		this.kontoStand = kontoStand;
	}
	
	//   Methoden
	private void inkrZaehler(){
		zaehler++;
	}
	/**
	 * @return int
	 */
	public int getKontostand(){
		return kontoStand;
	}
	
	/**
	 * @param betrag
	 */
	public void einzahlen(int betrag){
		inkrZaehler();
		kontoStand = kontoStand + betrag;
	}
	
	/**
	 * @param betrag
	 */
	public void auszahlen(int betrag){
		inkrZaehler();
		int fee;
		if (kontoStand < 100000){
			fee = 15;
		} else {
			fee = 0;
		}
		kontoStand = kontoStand - fee - betrag;
	}
	
	/**
	 * 
	 */
	public void anzeigen(){
		System.out.println(kontoNummer + "\t" + kontoInhaber + "\t" + 
				kontoStand + "\t" + zaehler);
	}
}