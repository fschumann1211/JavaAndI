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
 * @version 0.61.5
 *
 */
@SuppressWarnings("serial")
public class ConvF extends JFrame implements ActionListener {
	private JLabel heading = new JLabel("Convert Fahrenheit to Celsius");
	private JLabel inLabel = new JLabel("Fahrenheit:");
	private JLabel outLabel = new JLabel("Celsius");
	
	private JTextField inTxt = new JTextField(5);
	private JTextField outTxt = new JTextField(5);
	
	private int fahrTemp;
	private int celsTemp;
	
	public ConvF(String title){
		super (title);
		
		getContentPane().setLayout(new FlowLayout());
		getInTxt().addActionListener(this);
		
		add(heading);
		add(inLabel);
		add(inTxt);
		add(outLabel);
		add(outTxt);
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
		// TODO Auto-generated method stub

	}

	/**
	 * @return the heading
	 */
	public JLabel getHeading() {
		return heading;
	}

	/**
	 * @param heading the heading to set
	 */
	public void setHeading(JLabel heading) {
		this.heading = heading;
	}

	/**
	 * @return the inLabel
	 */
	public JLabel getInLabel() {
		return inLabel;
	}

	/**
	 * @param inLabel the inLabel to set
	 */
	public void setInLabel(JLabel inLabel) {
		this.inLabel = inLabel;
	}

	/**
	 * @return the outLabel
	 */
	public JLabel getOutLabel() {
		return outLabel;
	}

	/**
	 * @param outLabel the outLabel to set
	 */
	public void setOutLabel(JLabel outLabel) {
		this.outLabel = outLabel;
	}

	/**
	 * @return the inTxt
	 */
	public JTextField getInTxt() {
		return inTxt;
	}

	/**
	 * @param inTxt the inTxt to set
	 */
	public void setInTxt(JTextField inTxt) {
		this.inTxt = inTxt;
	}

	/**
	 * @return the outTxt
	 */
	public JTextField getOutTxt() {
		return outTxt;
	}

	/**
	 * @param outTxt the outTxt to set
	 */
	public void setOutTxt(JTextField outTxt) {
		this.outTxt = outTxt;
	}

	/**
	 * @return the fahrTemp
	 */
	public int getFahrTemp() {
		return fahrTemp;
	}

	/**
	 * @param fahrTemp the fahrTemp to set
	 */
	public void setFahrTemp(int fahrTemp) {
		this.fahrTemp = fahrTemp;
	}

	/**
	 * @return the celsTemp
	 */
	public int getCelsTemp() {
		return celsTemp;
	}

	/**
	 * @param celsTemp the celsTemp to set
	 */
	public void setCelsTemp(int celsTemp) {
		this.celsTemp = celsTemp;
	}

}
