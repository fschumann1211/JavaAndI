/**
 * 
 */
package draw;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

/**
 * @author frank
 *
 */
@SuppressWarnings("serial")
public class HouseRectangles extends JApplet {
	final int width = 350, height = 250;
	
	final int houseX = 50, houseY = 100, houseW = 150, houseH = 100;
	final int doorX = 120, doorY = 150, doorW = 20, doorH = 50;
	final int lWindX = 75, lWindY = 140, lWindW = 25, lWindH = 40;
	final int rWindX = 160, rWindY = 140, rWindW = 25, rWindH = 40;
	
	final int trunkX = 260, trunkY = 65, trunkW = 10, trunkH = 100;
	
	public void paint(Graphics gr){
		gr.setColor(Color.white);
		gr.fillRect(0, 0, 350, 250);
		
		gr.setColor(Color.orange);
		gr.drawRect(houseX, houseY, houseW, houseH);
		gr.drawRect(doorX, doorY, doorW, doorH);
		gr.drawRect(lWindX, lWindY, lWindW, lWindH);
		gr.drawRect(rWindX, rWindY, rWindW, rWindH);
		
		gr.drawRect(trunkX, trunkY, trunkW, trunkH);
	}

}
