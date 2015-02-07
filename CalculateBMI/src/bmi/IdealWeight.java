/**
 * 
 */
package bmi;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * @author frank
 * @version 0.63.11
 * 
 */
@SuppressWarnings("serial")
public class IdealWeight extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IdealWeight frame = new IdealWeight();

		frame.setLocation(100, 75);
		frame.setSize(300, 200);
		frame.setResizable(false);
		frame.setVisible(true);

	}

	private JRadioButton genderM;
	private JRadioButton genderF;
	private ButtonGroup genderGroup;
	private Box genderBox;
	private JRadioButton heightA;
	private JRadioButton heightB;
	private JRadioButton heightC;
	private JRadioButton heightD;
	private JRadioButton heightE;
	private ButtonGroup heightGroup;
	private Box heightBox;
	private JTextField resultText;

	private JPanel resultPanel;
	private Box btnBox;

	public IdealWeight() {
		super();
		// getContentPane().setLayout(new FlowLayout());

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/**
		 * Gender Group
		 */
		genderM = new JRadioButton("Male", true);
		genderF = new JRadioButton("Female", false);

		genderGroup = new ButtonGroup();
		genderGroup.add(genderM);
		genderGroup.add(genderF);

		genderBox = new Box(BoxLayout.Y_AXIS);

		genderBox.add(new JLabel("Your gender"));
		genderBox.add(Box.createRigidArea(new Dimension(1, 8)));
		genderBox.add(genderM);
		genderBox.add(genderF);
		genderBox.add(Box.createRigidArea(new Dimension(1, 70)));

		/**
		 * Height Group
		 */
		heightA = new JRadioButton("60 to 64 inches", true);
		heightB = new JRadioButton("64 to 68 inches", false);
		heightC = new JRadioButton("68 to 72 inches", false);
		heightD = new JRadioButton("72 to 76 inches", false);
		heightE = new JRadioButton("76 to 80 inches", false);

		heightGroup = new ButtonGroup();
		heightBox = new Box(BoxLayout.Y_AXIS);

		heightGroup.add(heightA);
		heightGroup.add(heightB);
		heightGroup.add(heightC);
		heightGroup.add(heightD);
		heightGroup.add(heightE);

		heightBox.add(new JLabel("Your height"));
		heightBox.add(Box.createRigidArea(new Dimension(1, 8)));
		heightBox.add(heightA);
		heightBox.add(heightB);
		heightBox.add(heightC);
		heightBox.add(heightD);
		heightBox.add(heightE);

		/*
		 * Button Box
		 */
		btnBox = new Box(BoxLayout.X_AXIS);
		btnBox.add(Box.createHorizontalGlue());
		btnBox.add(genderBox);
		btnBox.add(Box.createHorizontalGlue());
		btnBox.add(heightBox);
		btnBox.add(Box.createHorizontalGlue());
		/**
		 * result pane
		 */
		resultText = new JTextField(7);
		resultText.setEditable(false);

		resultPanel = new JPanel();
		// resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));

		resultPanel.add(new JLabel("Ideal Weight"));
		resultPanel.add(resultText);

		/*
		 * Frame w/ Box Layout
		 */
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(1,3)));
		add(btnBox);
		add(resultPanel);

		/*
		 * Add panels to content pane
		 * 
		 * getContentPane().setLayout(new BorderLayout());
		 * getContentPane().add(genderBox, BorderLayout.WEST);
		 * getContentPane().add(heightBox, BorderLayout.EAST);
		 * getContentPane().add(resultPanel, BorderLayout.SOUTH);
		 */
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
