package view;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class MainWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	

	public MainWindow() {
		super("ordenação");
		setPreferredSize(new Dimension(800, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		JTextField array = new JTextField(2);
//		JButton sorteia = new JButton("sorteia");
//		JButton ordena = new JButton("Ordena");
		
//		JLabel number = new JLabel();
		topPanel.add(new JLabel("Tamanho do array:"));
		topPanel.add(array);
//		topPanel.add(sorteia);
//		topPanel.add(ordena);
		topPanel.setMaximumSize(new Dimension(800, 500));
		add(topPanel);
		
		MyPanel pCanvas = new MyPanel();
		
		Sorteia gerador = new Sorteia("Gerar", pCanvas);
		Ordena ordenador = new Ordena("Ordena", pCanvas);
		add(pCanvas);
		topPanel.add(gerador);
		topPanel.add(ordenador);
		
		pack();
		this.setResizable(false);
	}


	
	public static void main(String[] args) {
		MainWindow w = new MainWindow();
		
	}
}
