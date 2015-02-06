/**
 * Interface für besteuerbare Güter
 */
package warenhausDB;

/**
 * @author frank
 * @version 0.53.8
 *
 */
public interface Besteuerbar {
	final double TAX = 0.06;
	
	double berechneSteuer();
}
