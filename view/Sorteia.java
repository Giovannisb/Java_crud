package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class Sorteia extends JButton{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Sorteia(String name, MyPanel pCanvas) {
		 super(name);
		 Random gerador = new Random();
	     
	     this.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	             
	        	 ArrayList<Integer> Numbers = new ArrayList<Integer>();
	        	 for (int i = 0; i < 20; i++) {
	                 Numbers.add(gerador.nextInt(100));
	             }
	             
	             System.out.println(Numbers);
	             
	             pCanvas.repaint();
	         }
	     });
	 }
}
