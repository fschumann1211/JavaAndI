package calc;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Snowflake extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3440416175131275455L;
	private Graphics graph;

	/**
	 * Create the applet.
	 */
	public void paint(Graphics gr) {
		graph = gr;
		int width = getWidth();
		int height = getHeight();
		
		gr.setColor(Color.white);
		gr.fillRect(0, 0, width, height);
		gr.setColor(Color.blue);
		
		drawStar(width/2,height/2,3);

	}

	private void drawStar(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

}
