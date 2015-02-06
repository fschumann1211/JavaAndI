import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author frank
 * @version 0.59.4
 *
 */
public class TwoBtns extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6250452776372360461L;

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	public TwoBtns(String title){
		super (title);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoBtns demo = new TwoBtns("Zwei Buttons");
		
		demo.setSize(200, 150);
		demo.setVisible(true);
	}

}
