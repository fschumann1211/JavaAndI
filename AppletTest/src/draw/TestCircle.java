package draw;

import java.awt.Graphics;

import javax.swing.JApplet;

@SuppressWarnings("serial")
public class TestCircle extends JApplet {
	Circle circ = new Circle(100, 100, 25);
	
	public void paint( Graphics gr){
		circ.draw(gr);
	}

}
