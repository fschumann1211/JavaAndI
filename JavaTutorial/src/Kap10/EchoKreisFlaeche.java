package Kap10;
/**
 * 
 */
import java.util.*;

/**
 * @author frank
 *
 */
public class EchoKreisFlaeche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int radius;
		double flaeche;
		
		System.out.println("Geben Sie den Radius des Kreises ein: ");
		radius = scan.nextInt();
		flaeche = radius * radius * Math.PI;
		
		System.out.println("Die Fläche eines Kreises mit einem Radius von " +
				radius + " beträgt " + flaeche);

	}

}
