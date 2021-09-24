import java.awt.Color;

import javax.swing.JFrame;

public class Snake {

	public static void main(String[] args) {
		
		//creating a frame for game
		JFrame frame = new JFrame("Snake Game");
		frame.setBounds(10,10,950,700);
		frame.setResizable(false);
		frame.setVisible(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.DARK_GRAY);
		
		Gameplay gameplay = new Gameplay();
		frame.add(gameplay);
	}
	
}
