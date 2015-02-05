/**
 * 
 */
package kap32;

/**
 * @author frank
 * @version 0.32.18
 *
 */
public class BankkontoTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bankkonto kto1 = new Bankkonto("123", "Bob", 100);
//		Bankkonto kto2 = new Bankkonto( "92a-44-33", "Kathy Emerson", 0 );
		
//		System.out.println(kto1.kontoNummer + " " + kto1.kontoInhaber +
//				" " + kto1.getKontostand());
//		
//		System.out.println(kto2.kontoNummer + " " + kto2.kontoInhaber +
//				" " + kto2.getKontostand());
		kto1.anzeigen();
		kto1.einzahlen(2000);
		kto1.auszahlen(1500);
		kto1.anzeigen();
	}

}
