import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author frank
 * @version 0.62.6
 * 
 */
@SuppressWarnings("serial")
public class FatCalc extends JFrame implements ActionListener {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FatCalc frame = new FatCalc("Calories from Fat");

		frame.setSize(300, 225);
		frame.setVisible(true);
	}
	private JLabel heading = new JLabel("Get Percent Calories from Fat");
	private JLabel fatLabel = new JLabel("Enter grams of fat:            ");
	private JTextField fatTxt = new JTextField(7);
	private JLabel calLabel = new JLabel("Enter total calories:          ");
	private JTextField calTxt = new JTextField(7);
	private JLabel outLabel = new JLabel("Percent calories from fat ");
	private JTextField outPer = new JTextField(7);
	private JButton doCalc = new JButton("Calculate");
	private double calories;
	private double fatGrams;

	private double percent;
	
	private JPanel headPanel = new JPanel();
	private JPanel fatPanel  = new JPanel();
	private JPanel calPanel  = new JPanel();
	private JPanel perPanel  = new JPanel();
	private JPanel btnPanel  = new JPanel();

	public FatCalc(String title) throws HeadlessException {
		super(title);

		getContentPane().setLayout(new FlowLayout());
		outPer.setEditable(false);

		headPanel.add(heading);
		fatPanel.add(fatLabel);
		fatPanel.add(fatTxt);
		calPanel.add(calLabel);
		calPanel.add(calTxt);
		perPanel.add(outLabel);
		perPanel.add(outPer);
		btnPanel.add(doCalc);

		add(headPanel);
		add(fatPanel);
		add(calPanel);
		add(perPanel);
		add(btnPanel);
		
		doCalc.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		setFatGrams(Double.parseDouble(getFatTxt().getText()));
		setCalories(Double.parseDouble(getCalTxt().getText()));

		calcPercent();

		outPer.setText(new DecimalFormat("#0.0##").format(percent) + "%");
		repaint();
	}

	private void calcPercent() {
		percent = ((fatGrams * 9) / calories) * 100;
	}

	/**
	 * @return the calLabel
	 */
	public JLabel getCalLabel() {
		return calLabel;
	}

	/**
	 * @return the calories
	 */
	public double getCalories() {
		return calories;
	}

	/**
	 * @return the calTxt
	 */
	public JTextField getCalTxt() {
		return calTxt;
	}

	/**
	 * @return the doCalc
	 */
	public JButton getDoCalc() {
		return doCalc;
	}

	/**
	 * @return the fatGrams
	 */
	public double getFatGrams() {
		return fatGrams;
	}

	/**
	 * @return the fatLabel
	 */
	public JLabel getFatLabel() {
		return fatLabel;
	}

	/**
	 * @return the fatTxt
	 */
	public JTextField getFatTxt() {
		return fatTxt;
	}

	/**
	 * @return the heading
	 */
	public JLabel getHeading() {
		return heading;
	}

	/**
	 * @return the outLabel
	 */
	public JLabel getOutLabel() {
		return outLabel;
	}

	/**
	 * @return the outPer
	 */
	public JTextField getOutPer() {
		return outPer;
	}

	/**
	 * @return the percent
	 */
	public double getPercent() {
		return percent;
	}

	/**
	 * @param calLabel
	 *            the calLabel to set
	 */
	public void setCalLabel(JLabel calLabel) {
		this.calLabel = calLabel;
	}

	/**
	 * @param calories
	 *            the calories to set
	 */
	public void setCalories(double calories) {
		this.calories = calories;
	}

	/**
	 * @param calTxt
	 *            the calTxt to set
	 */
	public void setCalTxt(JTextField calTxt) {
		this.calTxt = calTxt;
	}

	/**
	 * @param doCalc
	 *            the doCalc to set
	 */
	public void setDoCalc(JButton doCalc) {
		this.doCalc = doCalc;
	}

	/**
	 * @param fatGrams
	 *            the fatGrams to set
	 */
	public void setFatGrams(double fatGrams) {
		this.fatGrams = fatGrams;
	}

	/**
	 * @param fatLabel
	 *            the fatLabel to set
	 */
	public void setFatLabel(JLabel fatLabel) {
		this.fatLabel = fatLabel;
	}

	/**
	 * @param fatTxt
	 *            the fatTxt to set
	 */
	public void setFatTxt(JTextField fatTxt) {
		this.fatTxt = fatTxt;
	}

	/**
	 * @param heading
	 *            the heading to set
	 */
	public void setHeading(JLabel heading) {
		this.heading = heading;
	}

	/**
	 * @param outLabel
	 *            the outLabel to set
	 */
	public void setOutLabel(JLabel outLabel) {
		this.outLabel = outLabel;
	}

	/**
	 * @param outPer
	 *            the outPer to set
	 */
	public void setOutPer(JTextField outPer) {
		this.outPer = outPer;
	}

	/**
	 * @param percent
	 *            the percent to set
	 */
	public void setPercent(double percent) {
		this.percent = percent;
	}

}
