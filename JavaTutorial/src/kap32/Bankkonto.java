/**
 * 
 */
package kap32;

/**
 * @author frank
 * @version 0.32.11
 *
 */
public class Bankkonto {
	//   Felder
	String kontoNummer;
	String kontoInhaber;
	int kontoStand;
	
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
	
	void einzahlen(int betrag){
		kontoStand = kontoStand + betrag;
	}

}
