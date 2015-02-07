package circle;

import javax.swing.JApplet;

import java.awt.*;

// assume that the drawing area is 150 by 150
@SuppressWarnings("serial")
public class JustOneCircle extends JApplet
{
  int radius;

  /* (non-Javadoc)
 * @see java.awt.Container#paint(java.awt.Graphics)
 */
public void paint ( Graphics gr )
  { 
	int width = getWidth();
	int height = getHeight();
	
	if (width<height)
		radius = 2*width/5;
	else
		radius = 2*height/5;
    gr.setColor( Color.white );
    gr.fillRect( 0, 0, 150, 150 );
    gr.setColor( Color.black );

    gr.drawOval( (width/2 - radius), (height/2 - radius), radius*2, radius*2 );
   }
}