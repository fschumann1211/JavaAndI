/**
 * 
 */
package kap18;
import java.util.*;

/**
 * @author frank
 * @version 0.18.2
 *
 */
public class AddUpInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int value, sum = 0;
		
		System.out.println("Enter 1st Integer (0 to quit):");
		value = scan.nextInt();
		
		while (value!=0){
			sum = sum + value;
			System.out.println("Next Integer (0 to quit):");
			value = scan.nextInt();
		}
		System.out.println("Sum of all Integers: " + sum);
		scan.close();
	}

}
