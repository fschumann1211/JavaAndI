package circle;

import javax.swing.JApplet;

import java.awt.*;

// assume that the drawing area is 150 by 150
@SuppressWarnings("serial")
public class JustOneCircle extends JApplet
{
  final int radius = 25;

  /* (non-Javadoc)
 * @see java.awt.Container#paint(java.awt.Graphics)
 */
public void paint ( Graphics gr )
  { 
    gr.setColor( Color.white );
    gr.fillRect( 0, 0, 150, 150 );
    gr.setColor( Color.black );

    gr.drawOval( (150/2 - radius), (150/2 - radius), radius*2, radius*2 );
   }
}