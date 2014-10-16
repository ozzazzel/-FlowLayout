//here is test.java
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.*;

	public class FlowLayoutDemo{
		public static void main(String args[]){
		//create Frame
		JFrame frame = new JFrame("FlowLayout Test");
		//type FlowLayout
		frame.setLayout(new FlowLayout());
		//create panels
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		//create buttons
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");
		JButton b6 = new JButton("Button 6");
		//add buttons to panels 1 and 2
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		//add panels to frame
		frame.add(p1);
		frame.add(p2);
		//set size of panel
		frame.setSize(600,80);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	
	}
}
