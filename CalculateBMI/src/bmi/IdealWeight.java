/**
 * 
 */
package bmi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 * @author frank
 * @version 0.63.3
 *
 */
@SuppressWarnings("serial")
public class IdealWeight extends JFrame implements ActionListener {
	
	private JRadioButton genderM;
	private JRadioButton genderF;
	private ButtonGroup genderGroup;

	public IdealWeight(){
		genderM = new JRadioButton("Male", true);
		genderF = new JRadioButton("Female", false);
		
		genderGroup = new ButtonGroup();
		genderGroup.add(genderM);
		genderGroup.add(genderF);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
