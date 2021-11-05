package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
	Popcorn pop = new Popcorn(JOptionPane.showInputDialog("What flavor of popcorn would you like?"));
	Microwave micro = new Microwave();
	micro.putInMicrowave(pop);
	String min =JOptionPane.showInputDialog("How many minutes do you want to cook your popcorn");
	int minAsInt = Integer.parseInt(min);
	micro.setTime(minAsInt);
	micro.startMicrowave();
	}
}
