/**
 * 
 */
package kap18;
import java.util.*;

/**
 * @author frank
 * @version 0.18.8
 *
 */
public class AddUpInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int value, count = 0, sum = 0;
		String suffix = new String("");
		
		System.out.println("Enter 1st Integer (0 to quit):");
		value = scan.nextInt();
		
		while (value!=0){
			sum = sum + value;
			count++;
			if (((count+1) % 10 > 3) || (count+1) == 11 || (count+1) == 12 || (count+1) == 13 ){
				suffix = "th";
			} else {
				if ((count+1)%10 == 1) suffix = "st";
				if ((count+1)%10 == 2) suffix = "nd";
				if ((count+1)%10 == 3) suffix = "rd";
			}
			System.out.println((count+1) + suffix + " Integer (0 to quit):");
			value = scan.nextInt();
		}
		System.out.println("Sum of all " + count + " Integers: " + sum);
		scan.close();
	}

}
