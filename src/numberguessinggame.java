import java.util.Random;

import javax.swing.JOptionPane;

public class numberguessinggame {
	public static void main(String[] args) {

		Random number = new Random();
		int i = number.nextInt(3);

		String amazon = JOptionPane.showInputDialog("pick a random number between 0-1-2");

		int num5 = Integer.parseInt(amazon);

		if (num5 == i) {
			JOptionPane.showInternalMessageDialog(null, "you are right");
		}

		else {
			JOptionPane.showMessageDialog(null, "You are dumb ");
			amazon = JOptionPane.showInputDialog("pick another random number");
			num5 = Integer.parseInt(amazon);
		}
		if (num5 == i) {
			JOptionPane.showMessageDialog(null, "you are right");

		} else {
			JOptionPane.showMessageDialog(null, "Elighi is dumb not you!!!!!!!!!");
		}

	}
}
