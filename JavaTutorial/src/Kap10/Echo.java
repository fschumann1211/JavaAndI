package Kap10;
/**
 * 
 */
import java.util.*;


/**
 * @author frank
 *
 */
public class Echo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inData;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie Daten ein: ");
		inData = scan.nextLine();
		
		System.out.println("Sie haben eingegeben: " + inData);
	}

}
