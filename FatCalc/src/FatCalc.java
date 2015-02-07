import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 * @author frank
 * @version 0.61.15
 *
 */
@SuppressWarnings("serial")
public class FatCalc extends JFrame implements ActionListener {
	private JLabel heading =    new JLabel("Get Percent Calories from Fat");
	private JLabel fatLabel =   new JLabel("Enter grams of fat:            ");
	private JTextField fatTxt = new JTextField(7);
	private JLabel calLabel =   new JLabel("Enter total calories:          ");
	private JTextField calTxt = new JTextField(7);
	private JLabel outLabel =   new JLabel("Percent calories from fat ");
	private JTextField outPer = new JTextField(7);
	private JButton doCalc =    new JButton("Calculate");
	private double calories;
	private double fatGrams;
	private double percent;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FatCalc frame = new FatCalc("Calories from Fat");
		
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

	public FatCalc(String title) throws HeadlessException {
		super(title);
		
		getContentPane().setLayout(new FlowLayout());
		outPer.setEditable(false);
		
		add(heading);
		add(fatLabel);
		add(fatTxt);
		add(calLabel);
		add(calTxt);
		add(outLabel);
		add(outPer);
		add(doCalc);
		
		doCalc.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		setFatGrams(Double.parseDouble(getFatTxt().getText()));
		setCalories(Double.parseDouble(getCalTxt().getText()));
		
		calcPercent();
		
		outPer.setText(String.valueOf(percent));
		repaint();
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
	 * @return the fatLabel
	 */
	public JLabel getFatLabel() {
		return fatLabel;
	}

	/**
	 * @param fatLabel the fatLabel to set
	 */
	public void setFatLabel(JLabel fatLabel) {
		this.fatLabel = fatLabel;
	}

	/**
	 * @return the fatTxt
	 */
	public JTextField getFatTxt() {
		return fatTxt;
	}

	/**
	 * @param fatTxt the fatTxt to set
	 */
	public void setFatTxt(JTextField fatTxt) {
		this.fatTxt = fatTxt;
	}

	/**
	 * @return the calLabel
	 */
	public JLabel getCalLabel() {
		return calLabel;
	}

	/**
	 * @param calLabel the calLabel to set
	 */
	public void setCalLabel(JLabel calLabel) {
		this.calLabel = calLabel;
	}

	/**
	 * @return the calTxt
	 */
	public JTextField getCalTxt() {
		return calTxt;
	}

	/**
	 * @param calTxt the calTxt to set
	 */
	public void setCalTxt(JTextField calTxt) {
		this.calTxt = calTxt;
	}

	/**
	 * @return the outPer
	 */
	public JTextField getOutPer() {
		return outPer;
	}

	/**
	 * @param outPer the outPer to set
	 */
	public void setOutPer(JTextField outPer) {
		this.outPer = outPer;
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
	 * @return the doCalc
	 */
	public JButton getDoCalc() {
		return doCalc;
	}

	/**
	 * @param doCalc the doCalc to set
	 */
	public void setDoCalc(JButton doCalc) {
		this.doCalc = doCalc;
	}

	/**
	 * @return the calories
	 */
	public double getCalories() {
		return calories;
	}

	/**
	 * @param calories the calories to set
	 */
	public void setCalories(double calories) {
		this.calories = calories;
	}

	/**
	 * @return the fatGrams
	 */
	public double getFatGrams() {
		return fatGrams;
	}

	/**
	 * @param fatGrams the fatGrams to set
	 */
	public void setFatGrams(double fatGrams) {
		this.fatGrams = fatGrams;
	}

	/**
	 * @return the percent
	 */
	public double getPercent() {
		return percent;
	}

	/**
	 * @param percent the percent to set
	 */
	public void setPercent(double percent) {
		this.percent = percent;
	}

}
