/**
 * 
 */
package test;

import java.awt.*;

import javax.swing.*;

/**
 * @author frank
 * @version 0.56.11
 *
 */
public class MyFrame extends JFrame {
	private JLabel label;
	
	public MyFrame(String title) {
		super (title);
		setSize(150, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		label = new JLabel("Hello Swing!");
		add(label);
	}

	/**
	 * @return the label
	 */
	public JLabel getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(JLabel label) {
		this.label = label;
	}
}
