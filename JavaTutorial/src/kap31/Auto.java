/**
 * 
 */
package kap31;

/**
 * @author frank
 * @version 0.31.15
 *
 */

public class Auto {
	double startMeilen;
	double endMeilen;
	double gallonen;
	
	/**
	 * @param startTacho Anfangsstand Tacho
	 * @param endTacho Endstand Tacho
	 * @param galls Verbrauchte Gallonen
	 */
	public Auto(double startTacho, double endTacho, double galls) {
		startMeilen = startTacho;
		endMeilen = endTacho;
		gallonen = galls;
	}
	/**
	 * @return double
	 */
	double berechneMPG(){
		return ((endMeilen-startMeilen)/gallonen);
	}
}
