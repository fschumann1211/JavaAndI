/**
 * 
 */
package kap32;

/**
 * @author frank
 * @version 0.32.9
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

}
