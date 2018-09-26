import java.util.Random;

import javax.swing.JOptionPane;

public class Randomguse {
public static void main(String[] args) {
	
	String fan = JOptionPane.showInputDialog("Pick 0 1 or 2");
	int num= Integer.parseInt(fan);
	
	
	Random guse=new Random();
	
	int num3= guse.nextInt(3);
	
	if (num == num3) {
		JOptionPane.showMessageDialog(null,"corrrrrrrrrrrrrrrrrrrrect");
	}
	else {
		JOptionPane.showMessageDialog(null,"incorrrrrrrrrrrrrect");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
