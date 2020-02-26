package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public void sorteio() {
		Random gerador = new Random();
        for (int i = 0; i < 5; i++) {
            this.numbers.add(gerador.nextInt(10) + 1);
        }
        System.out.println(numbers);
	}

	@Override
	protected void paintComponent(Graphics g) {
		sorteio();
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	
		int QTD = numbers.size();
		int width = (this.getSize().width / numbers.size());
		int height = this.getHeight();
		g.setColor(Color.white);
		
		for(int i = 0; i< QTD; i++) {
			int aux = (numbers.get(i) *100) / height;
            int calculatedHeight = aux * 10;
            
			g.fillRect(i * width ,  height - calculatedHeight, width + 1 , calculatedHeight + 1 );
		}
	}
	
	public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    
    public void sort(){
    	int j;
        int key;
        int i;
    	for (j = 1; j < numbers.size(); j++){
            key = numbers.get(j);
            for (i = j - 1; (i >= 0) && (numbers.get(i) > key); i--){
            	//vetor[i + 1] = vetor[i];
          	  	numbers.set(i + 1, numbers.get(i));
            }
            //vetor[i + 1] = key;
            numbers.set(i + 1, key);
           	System.out.println(numbers);
           	this.repaint();
        }
    }
	
	
}