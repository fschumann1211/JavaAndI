import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author frank
 * @version 0.60.6
 * 
 */
public class TxtBsp1 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3303381175228576064L;
	private JTextField text;
	private JLabel lbl;

	public TxtBsp1(String title) {
		super(title);

		text = new JTextField(15);
		
		lbl = new JLabel("Geben Sie Ihren Namen ein:");
		
		getContentPane().setLayout(new FlowLayout());

		getContentPane().add(lbl);
		getContentPane().add(text);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TxtBsp1 txtBsp = new TxtBsp1("Text Feld");

		txtBsp.setSize(300, 100);
		txtBsp.setVisible(true);
	}

	public JTextField getText() {
		return text;
	}

	public void setText(JTextField text) {
		this.text = text;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
