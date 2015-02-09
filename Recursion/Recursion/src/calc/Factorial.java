package calc;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Factorial extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8096817583494366199L;
	private JPanel contentPane, inputPane, outputPane;
	private JLabel inLabel, outLabel;
	private JTextField inText, outText;
	private JButton doIt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factorial frame = new Factorial();
					frame.setTitle("Calculate Factorial");
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
	public Factorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		inputPane = new JPanel();
		inLabel = new JLabel("Enter an Integer:");
		inText = new JTextField(7);
		
		inputPane.add(inLabel);
		inputPane.add(inText);
		
		contentPane.add(inputPane, BorderLayout.NORTH);
		
		outputPane = new JPanel();
		outLabel = new JLabel("Factorial");
		outText = new JTextField(15);
		outText.setEditable(false);
		
		outputPane.add(outLabel);
		outputPane.add(outText);
		contentPane.add(outputPane, BorderLayout.CENTER);
		
		doIt = new JButton("Calculate");
		doIt.addActionListener(this);
		doIt.setActionCommand("calc");
		
		contentPane.add(doIt, BorderLayout.SOUTH);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String userIn = inText.getText();
		try {
			outText.setText(String.valueOf(
					calculateFac(Integer.parseInt(userIn))));
		} catch (Exception ex){
			outText.setText("NoINT");
		}
		
	}

	private int calculateFac(int parseInt) {
		if (parseInt == 0){
			return 1;
		} else {
			return parseInt * calculateFac(parseInt-1);
		}
	}
}
