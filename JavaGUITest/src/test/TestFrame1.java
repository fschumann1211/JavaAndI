/**
 * First Test of Swing Frames
 */
package test;

import java.awt.*;
import javax.swing.*;


/**
 * @author frank
 * @version 0.56.7
 *
 */
public class TestFrame1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int breite=200, hoehe=100;
		JFrame frame = new JFrame("Test Frame 1");
//		frame.setSize(200, 100);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int extra=0; extra<500; extra+=1)
			frame.setSize(breite+extra, hoehe+extra);
	}

}
