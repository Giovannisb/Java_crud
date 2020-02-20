package view;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class MainWindow extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainWindow() {
		super("ordenação");
		setPreferredSize(new Dimension(300, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel titulo = new JLabel("Ordenação");
		titulo.setFont(new Font("serif", Font.BOLD, 24));
		topPanel.add(titulo);
		topPanel.setMaximumSize(new Dimension(300, 300));
		add(topPanel);
		
		MyPanel pCanvas = new MyPanel();
		add(pCanvas);
		
		pack();
	}
	
	public static void main(String[] args) {
		MainWindow w = new MainWindow();
	}
}
