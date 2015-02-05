/**
 * 
 */
package kap32;

/**
 * @author frank
 * @version 0.33.3
 *
 */
public class Bankkonto {
	//   Felder
	private String kontoNummer;
	private String kontoInhaber;
	private int kontoStand;
	
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
	int getKontostand(){
		return kontoStand;
	}
	
	/**
	 * @param betrag
	 */
	void einzahlen(int betrag){
		kontoStand = kontoStand + betrag;
	}
	
	/**
	 * @param betrag
	 */
	void auszahlen(int betrag){
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
		System.out.println(kontoNummer + "\t" + kontoInhaber + "\t" + kontoStand);
	}
}