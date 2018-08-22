import javax.swing.JOptionPane;

public class testscore {
public static void main(String[] args) {
	
	String Elena = JOptionPane.showInputDialog("What is the score of your 1 quiz");
	int emma= Integer.parseInt(Elena);
	
	if (emma > 90 && emma < 100) {
		JOptionPane.showMessageDialog(null,"A");
	}
	else if (emma >= 80 && emma < 89) {
		JOptionPane.showMessageDialog(null,"B");
	}
	else if (emma > 70 && emma <79) {
		JOptionPane.showMessageDialog(null,"C");
	}
	else if (emma > 60 && emma < 69) {
		JOptionPane.showMessageDialog(null,"D");
	}	
	
	else if (emma > 0 && emma < 59) {
		JOptionPane.showMessageDialog(null,"F");
	}
	else {
	JOptionPane.showMessageDialog(null,"ERROR");
	}
	
	
	
}
}
