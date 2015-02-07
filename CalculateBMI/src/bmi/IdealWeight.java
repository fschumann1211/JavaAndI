/**
 * 
 */
package bmi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * @author frank
 * @version 0.63.5
 *
 */
@SuppressWarnings("serial")
public class IdealWeight extends JFrame implements ActionListener {
	
	private JRadioButton genderM;
	private JRadioButton genderF;
	private ButtonGroup genderGroup;
	private JPanel genderPanel;
	private JRadioButton heightA;
	private JRadioButton heightB;
	private JRadioButton heightC;
	private JRadioButton heightD;
	private JRadioButton heightE;
	private ButtonGroup heightGroup;
	private JPanel heightPanel;

	public IdealWeight(){
		/**
		 * Gender Group
		 */
		genderM = new JRadioButton("Male", true);
		genderF = new JRadioButton("Female", false);
		
		genderGroup = new ButtonGroup();
		genderGroup.add(genderM);
		genderGroup.add(genderF);
		
		genderPanel = new JPanel();
		
		genderPanel.setLayout(new BoxLayout(genderPanel, BoxLayout.Y_AXIS));
		
		genderPanel.add(new JLabel("Select your gender"));
		genderPanel.add(genderM);
		genderPanel.add(genderF);
		
		/**
		 * Height Group
		 */
		heightA = new JRadioButton("60 to 64 inches");
		heightB = new JRadioButton("64 to 68 inches");
		heightC = new JRadioButton("68 to 72 inches");
		heightD = new JRadioButton("72 to 76 inches");
		heightE = new JRadioButton("76 to 80 inches");
		
		heightGroup = new ButtonGroup();
		heightPanel = new JPanel();
		
		heightGroup.add(heightA);
		heightGroup.add(heightB);
		heightGroup.add(heightC);
		heightGroup.add(heightD);
		heightGroup.add(heightE);
		
		heightPanel.setLayout(new BoxLayout(heightPanel, BoxLayout.Y_AXIS));
		
		heightPanel.add(new JLabel("Select your height"));
		heightPanel.add(heightA);
		heightPanel.add(heightB);
		heightPanel.add(heightC);
		heightPanel.add(heightD);
		heightPanel.add(heightE);
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
