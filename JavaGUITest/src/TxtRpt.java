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
 * @version 0.60.11
 *
 */
public class TxtRpt extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2755410326286949217L;
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TxtRpt frame = new TxtRpt("Text Wiederholer");
		
		frame.setSize(400, 100);
		frame.setVisible(true);
		// TODO Auto-generated method stub

	}
	private JLabel inLabel = new JLabel("Geben Sie Ihren Namen ein:");
	private JTextField inTxt = new JTextField(15);
	
	private JLabel outLabel = new JLabel("Hier kommt dann Ihr Name:");

	private JTextField outTxt = new JTextField(15);

	public TxtRpt(String title){
		super(title);
		
		setLayout(new FlowLayout());
		
		add(inLabel);
		add(inTxt);
		add(outLabel);
		add(outTxt);
		
		inTxt.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		copyText();
		repaint();
	}

	private void copyText() {
		String name = inTxt.getText();
		outTxt.setText(name);
	}
	/**
	 * @return the inLabel
	 */
	public JLabel getInLabel() {
		return inLabel;
	}

	/**
	 * @return the inTxt
	 */
	public JTextField getInTxt() {
		return inTxt;
	}

	/**
	 * @return the outLabel
	 */
	public JLabel getOutLabel() {
		return outLabel;
	}

	/**
	 * @return the outTxt
	 */
	public JTextField getOutTxt() {
		return outTxt;
	}

	/**
	 * @param inLabel the inLabel to set
	 */
	public void setInLabel(JLabel inLabel) {
		this.inLabel = inLabel;
	}

	/**
	 * @param inTxt the inTxt to set
	 */
	public void setInTxt(JTextField inTxt) {
		this.inTxt = inTxt;
	}

	/**
	 * @param outLabel the outLabel to set
	 */
	public void setOutLabel(JLabel outLabel) {
		this.outLabel = outLabel;
	}

	/**
	 * @param outTxt the outTxt to set
	 */
	public void setOutTxt(JTextField outTxt) {
		this.outTxt = outTxt;
	}

}
