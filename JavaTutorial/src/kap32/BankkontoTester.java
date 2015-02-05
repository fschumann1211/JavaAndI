/**
 * 
 */
package kap32;

/**
 * @author frank
 * @version 0.32.8
 *
 */
public class BankkontoTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bankkonto kto1 = new Bankkonto("123", "Bob", 100);
		
		System.out.println(kto1.kontoNummer + " " + kto1.kontoInhaber +
				" " + kto1.kontoStand);

	}

}
