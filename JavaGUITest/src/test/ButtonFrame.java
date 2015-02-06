/**
 * 
 */
package test;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author frank
 * @version 0.57.3
 *
 */
public class ButtonFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8129231485673262442L;
	private JButton bChange;
	
	public ButtonFrame(String title) {
		
		super(title);
		setLayout(new FlowLayout());
		
		bChange = new JButton("Klick mich!");
		add(bChange);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the bChange
	 */
	public JButton getbChange() {
		return bChange;
	}

	/**
	 * @param bChange the bChange to set
	 */
	public void setbChange(JButton bChange) {
		this.bChange = bChange;
	}

}
