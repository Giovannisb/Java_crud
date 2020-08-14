package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Collections.shuffle(numbers);
		int outerSpace = 5;
		int innerSpace = 1;
		int QTD = numbers.size();
		int width = (this.getWidth() - 2 * outerSpace - (QTD - 1) * innerSpace) / QTD;
		int height = (this.getHeight() - 2 * outerSpace - (QTD - 1) * innerSpace)/ QTD;
		
		g.setColor(Color.white);
		for(int i = 0; i< QTD; i++) {
			int n = numbers.get(i);
			g.fillRect(outerSpace + i * (width + innerSpace), this.getHeight() - n * height - outerSpace, width, n * height);
		}
	}
}