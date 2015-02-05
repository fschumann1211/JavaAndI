/**
 * 
 */
package kap32;

/**
 * @author frank
 * @version 0.33.10
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
	Bankkonto (String kontoNummer, String kontoInhaber, int kontoStand){
		this.kontoNummer = kontoNummer;
		this.kontoInhaber = kontoInhaber;
		this.kontoStand = kontoStand;
	}
	
	//   Methoden
	/**
	 * @return
	 */
	private void inkrZaehler(){
		zaehler++;
	}
	int getKontostand(){
		return kontoStand;
	}
	
	/**
	 * @param betrag
	 */
	void einzahlen(int betrag){
		inkrZaehler();
		kontoStand = kontoStand + betrag;
	}
	
	/**
	 * @param betrag
	 */
	void auszahlen(int betrag){
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
	void anzeigen(){
		System.out.println(kontoNummer + "\t" + kontoInhaber + "\t" + 
				kontoStand + "\t" + zaehler);
	}
}