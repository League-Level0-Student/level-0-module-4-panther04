import java.util.Date;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	String Friday = JOptionPane.showInputDialog("What is your birthday");
	
	if(Friday.equals("08/14")) {
	JOptionPane.showMessageDialog(null,"Happy Birthday");
	}
	
	
	else {
		JOptionPane.showMessageDialog(null,"Happy Merry UnBirthday");
	}
	
	
	
	
}
}
