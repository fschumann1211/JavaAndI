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

	private JRadioButton[] btnGender;
	private ButtonGroup genderGroup;
	private Box genderBox;
	private JRadioButton[] btnHeight;
	private ButtonGroup heightGroup;
	private Box heightBox;
	private JTextField resultText;
	
	private String gender;
	private String height;

	private JPanel resultPanel;
	private Box btnBox;

	public IdealWeight() {
		super();
		// getContentPane().setLayout(new FlowLayout());

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/**
		 * Gender Group
		 */
		btnGender[0] = new JRadioButton("Male", true);
		btnGender[1] = new JRadioButton("Female", false);
		
		btnGender[0].setActionCommand("M");
		btnGender[0].addActionListener(this);
		
		btnGender[1].setActionCommand("F");
		btnGender[1].addActionListener(this);
		
		for (int i = 0; i < btnGender.length;i++){
			if (btnGender[i].isEnabled())
				gender = btnGender[i].getActionCommand();
		}

		genderGroup = new ButtonGroup();
		genderGroup.add(btnGender[0]);
		genderGroup.add(btnGender[1]);

		genderBox = new Box(BoxLayout.Y_AXIS);

		genderBox.add(new JLabel("Your btnGender"));
		genderBox.add(Box.createRigidArea(new Dimension(1, 8)));
		genderBox.add(btnGender[0]);
		genderBox.add(btnGender[1]);
		genderBox.add(Box.createRigidArea(new Dimension(1, 70)));

		/**
		 * Height Group
		 */
		btnHeight[0] = new JRadioButton("60 to 64 inches", true);
		btnHeight[1] = new JRadioButton("64 to 68 inches", false);
		btnHeight[2] = new JRadioButton("68 to 72 inches", false);
		btnHeight[3] = new JRadioButton("72 to 76 inches", false);
		btnHeight[4] = new JRadioButton("76 to 80 inches", false);
		
		for (int i = 0; i < btnHeight.length; i++){
			if (btnHeight[i].isEnabled()){
				height = btnHeight[i].getActionCommand();
			}
		}
		
		btnHeight[0].setActionCommand("A");
		btnHeight[0].addActionListener(this);
		btnHeight[1].setActionCommand("B");
		btnHeight[1].addActionListener(this);
		btnHeight[2].setActionCommand("C");
		btnHeight[2].addActionListener(this);
		btnHeight[3].setActionCommand("D");
		btnHeight[3].addActionListener(this);
		btnHeight[4].setActionCommand("E");
		btnHeight[4].addActionListener(this);
		

		heightGroup = new ButtonGroup();
		heightBox = new Box(BoxLayout.Y_AXIS);

		heightGroup.add(btnHeight[0]);
		heightGroup.add(btnHeight[1]);
		heightGroup.add(btnHeight[2]);
		heightGroup.add(btnHeight[3]);
		heightGroup.add(btnHeight[4]);

		heightBox.add(new JLabel("Your btnHeight"));
		heightBox.add(Box.createRigidArea(new Dimension(1, 8)));
		heightBox.add(btnHeight[0]);
		heightBox.add(btnHeight[1]);
		heightBox.add(btnHeight[2]);
		heightBox.add(btnHeight[3]);
		heightBox.add(btnHeight[4]);

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
		
		/**
		 * run Calculation of ideal Weight initialy
		 */
		calculateIW(gender,height);

		/*
		 * Add panels to content pane
		 * 
		 * getContentPane().setLayout(new BorderLayout());
		 * getContentPane().add(genderBox, BorderLayout.WEST);
		 * getContentPane().add(heightBox, BorderLayout.EAST);
		 * getContentPane().add(resultPanel, BorderLayout.SOUTH);
		 */
	}

	private void calculateIW(String g, String h) {
		// TODO Auto-generated method stub
		
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
