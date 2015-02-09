package calc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Fibonacci extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3178025831722430552L;
	private JPanel contentPane, inJPanel, outJPanel;
	private Box uiBox;
	private JLabel inJLabel, outJLabel;
	private JTextField inField, outField;
	private JButton doJButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
					frame.setTitle("Calculate Fibonacci Number");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		uiBox = new Box(BoxLayout.Y_AXIS);
		getContentPane().add(uiBox, BorderLayout.CENTER);
		
		inJPanel = new JPanel();
		inJLabel = new JLabel("Enter a positive Integer");
		inField  = new JTextField(7);
		
		inJPanel.add(inJLabel);
		inJPanel.add(inField);
		uiBox.add(inJPanel);
		
		outJPanel = new JPanel();
		outJLabel = new JLabel("Fibonacci Number");
		outField  = new JTextField(10);
		
		outField.setEditable(false);
		
		outJPanel.add(outJLabel);
		outJPanel.add(outField);
		uiBox.add(outJPanel);
		
		doJButton = new JButton("Calculate");
		doJButton.addActionListener(this);
		add(doJButton, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String userIn = inField.getText();
		
		try {
			outField.setText(String.valueOf(fib(Integer.parseInt(userIn))));;
		} catch (Exception ex) {
			outField.setText("NoINT");
		}
		
	}

	private int fib(int parseInt) {
		if (parseInt == 1)
			return 1;
		else if (parseInt == 2)
			return 1;
		else
			return fib(parseInt-2) + fib(parseInt-1);
	}

}
