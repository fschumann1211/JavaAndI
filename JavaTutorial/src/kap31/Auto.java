/**
 * 
 */
package kap31;

/**
 * @author frank
 * @version 0.31.2
 *
 */

public class Auto {
	double startMeilen;
	double endMeilen;
	double gallonen;
	
	/**
	 * @param startTacho
	 * @param endTacho
	 * @param galls
	 */
	public Auto(double startTacho, double endTacho, double galls) {
		startMeilen = startTacho;
		endMeilen = endTacho;
		gallonen = galls;
	}
	/**
	 * @return
	 */
	double berechneMPG(){
		return ((endMeilen-startMeilen)/gallonen);
	}
}
