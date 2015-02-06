/**
 * First Test of Swing Frames
 */
package test;

import java.awt.*;
import javax.swing.*;


/**
 * @author frank
 * @version 0.56.3
 *
 */
public class TestFrame1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Frame 1");
		frame.setSize(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
