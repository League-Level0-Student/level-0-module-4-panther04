import javax.swing.JOptionPane;

public class Numbersorter {
	public static void main(String[] args) {

		String imput = JOptionPane.showInputDialog("Enter a number");
		int num1 = Integer.parseInt(imput);
		imput = JOptionPane.showInputDialog("Enter another number");
		int num2 = Integer.parseInt(imput);
		imput = JOptionPane.showInputDialog("Enter another number");
		int num3 = Integer.parseInt(imput);

		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				JOptionPane.showMessageDialog(null, num1 + ", " + num2 + ", " + num3);

			} else {
				JOptionPane.showMessageDialog(null, num1 + ", " + num3 + ", " + num2);
			}
		} else if (num2 < num1 && num2 < num3) {
			if (num3 < num1) {
				JOptionPane.showMessageDialog(null, num2 + ", " + num3 + ", " + num1);
			} else {
				JOptionPane.showMessageDialog(null, num2 + ", " + num1 + ", " + num3);
			}
		} else if (num3 < num2 && num3 < num1) {
			if (num1 < num2) {
				JOptionPane.showMessageDialog(null, num3 + ", " + num1 + ", " + num2);
			} else {
				JOptionPane.showMessageDialog(null, num3 + ", " + num2 + ", " + num1);
			}
		}

	}
}
