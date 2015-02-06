import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author frank
 * @version 0.59.7
 *
 */
public class TwoBtns extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6250452776372360461L;
	private JButton redBtn;
	private JButton grnBtn;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoBtns demo = new TwoBtns("Zwei Buttons");
		
		demo.setSize(200, 150);
		demo.setVisible(true);
	}
	
	/**
	 * @return the redBtn
	 */
	public JButton getRedBtn() {
		return redBtn;
	}

	/**
	 * @param redBtn the redBtn to set
	 */
	public void setRedBtn(JButton redBtn) {
		this.redBtn = redBtn;
	}

	/**
	 * @return the grnBtn
	 */
	public JButton getGrnBtn() {
		return grnBtn;
	}

	/**
	 * @param grnBtn the grnBtn to set
	 */
	public void setGrnBtn(JButton grnBtn) {
		this.grnBtn = grnBtn;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TwoBtns(String title){
		super (title);
		
		redBtn = new JButton("Rot");
		grnBtn = new JButton("Grün");
		
		getContentPane().setLayout(new FlowLayout());
		
		redBtn.setActionCommand("rot");
		redBtn.addActionListener(this);
		add(redBtn);
		
		grnBtn.setActionCommand("gruen");
		grnBtn.addActionListener(this);
		add(grnBtn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		getContentPane().setBackground(Color.green);
		repaint();
	}

}
