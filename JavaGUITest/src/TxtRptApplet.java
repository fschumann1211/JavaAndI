import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author frank
 * @version 0.60.16
 *
 */
@SuppressWarnings("serial")
public class TxtRptApplet extends JApplet implements ActionListener {
	JTextField source, desination;
	JLabel sLabel, dLabel;
	
	/* (non-Javadoc)
	 * @see java.applet.Applet#init()
	 */
	public void init(){
		source = new JTextField(15);
		desination = new JTextField(15);
		sLabel = new JLabel("Geben Sie Ihren Namen ein:");
		dLabel = new JLabel("Hier kommt dann ihr Name:");
		
		setLayout(new FlowLayout());
		
		add(sLabel);
		add(source);
		add(dLabel);
		add(desination);
		
		source.addActionListener(this);
		this.setBackground(Color.white);
		
		setSize(400, 100);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		desination.setText(source.getText());
		repaint();
	}

}
