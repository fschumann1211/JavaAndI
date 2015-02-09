package calc;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

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
//		int min = (height > width)?width:height;
		int x, y, size;
		
		Random rand = new Random();
		
		gr.setColor(Color.white);
		gr.fillRect(0, 0, width-1, height-1);
		gr.setColor(Color.blue);
		
		for (int ii = 0; ii < 250; ii++){
			x = rand.nextInt(width);
			y = rand.nextInt(height);
			size = rand.nextInt(30);
			
			drawStar(x,y,size);
			
		}
	}

	private void drawStar(int x, int y, int size) {
		// TODO Auto-generated method stub
		int endX, endY;
		
		if (size < 2) return;
		/*
		 * Six lines radiating from center
		 */
		
		for (int i = 0; i < 6; i++){
			endX = x + (int)(size*Math.cos((2*Math.PI/6)*i));
			endY = y - (int)(size*Math.sin((2*Math.PI/6)*i));
			
			graph.drawLine(x, y, endX, endY);
			drawStar(endX, endY, size/3);
		}
	}

}
