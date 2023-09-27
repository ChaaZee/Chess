package Chess;

import javax.swing.JFrame;

public class Window {

	public Window(Chess chess) {
		JFrame frame = new JFrame("Chess");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		frame.add(chess);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		chess.start();
	}

}
