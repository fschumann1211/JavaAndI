/**
 * 
 */
package test;

//import java.awt.*;
import javax.swing.*;

/**
 * @author frank
 * @version 0.56.10
 *
 */
public class ZweiTestFrames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame master = new JFrame("Klicken Sie, um alles zu beenden.");
		JFrame temp   = new JFrame("Klicken Sie, um NUR diesen Frame zu beenden");
		
		master.setVisible(true);
		master.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		master.setSize(400, 300);
		
		temp.setVisible(true);
		temp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		temp.setSize(300, 200);
	}
}
