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
 * @version 0.57.22
 *
 */
public class BtnQuitter extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5352107660082263738L;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BtnQuitter frame = new BtnQuitter("Button Quitter");
		
		frame.setSize(200, 100);
		frame.setVisible(true);
		// TODO Auto-generated method stub

	}
	
	JButton bQuit = new JButton("Klick hier für Exit");

	/**
	 * @param title
	 * 			The Title of the Frame
	 */
	public BtnQuitter(String title){
		super(title);
		
		setLayout(new FlowLayout());
		bQuit.addActionListener(this);
		add(bQuit);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		// TODO Auto-generated method stub
		
	}

}
