package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ordena extends JButton{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ordena(String name, MyPanel pCanvas) {
		super(name);
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pCanvas.sort();
			}
		});
	}
}
