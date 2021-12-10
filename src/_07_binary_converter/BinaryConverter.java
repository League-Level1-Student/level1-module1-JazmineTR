package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener  {
	JFrame frame = new JFrame("Convert 8 bits of binary into ASCII");
	JPanel pan = new JPanel();
	JTextField answer = new JTextField(25);
	JButton contend = new JButton();
	
	public void run() {
		frame.add(pan);
		frame.setVisible(true);
		contend.setText("Convert");
		contend.addActionListener(this);
		pan.add(answer);
		pan.add(contend);
	}
@Override
public void actionPerformed(ActionEvent a) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) a.getSource();
	if(buttonPressed.equals(contend)) {
		String input = "";
		    if(input.length() != 8){
		        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		        return;
		    }
		    String binary = "[0-1]+";//must contain numbers in the given range
		    if (!input.matches(binary)) {
		        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
		        return;   
		    }
		    try {
		        int asciiValue = Integer.parseInt(input, 2);
		        char theLetter = (char) asciiValue;
		        return;
		    } 
		    catch (Exception e) {
		        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		        return;
		    }
		}
}
}


