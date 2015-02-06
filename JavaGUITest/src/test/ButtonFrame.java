/**
 * 
 */
package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author frank
 * @version 0.57.13
 *
 */
public class ButtonFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8129231485673262442L;
	private JButton bChange;
	
	public ButtonFrame(String title) {
		
		super(title);
		getContentPane().setLayout(new FlowLayout());
		
		bChange = new JButton("Klick mich!");
		getContentPane().setLayout(new FlowLayout());
		bChange.addActionListener(this);
		
		getContentPane().add(bChange);
		
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

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
