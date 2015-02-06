package Kap10;
/**
 * 
 */
import java.util.*;
/**
 * @author frank
 *
 */
public class EchoQuadrat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int zahl, quadrat;
		
		System.out.println("Geben Sie eine Ganzzahl ein: ");
		
		zahl = scan.nextInt();
		quadrat = zahl * zahl;
		
		System.out.println("Das Quadrat von " + zahl + " ist " + quadrat);
		scan.close();
	}

}
