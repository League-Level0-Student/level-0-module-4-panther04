import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryticket {
	public static void main(String[] args) {
		
		Random lottery=new Random();
	
		String msg = ""; 
		
	for (int i = 0; i < 5; i++) {
		msg += lottery.nextInt(101)+", ";
	}
	
	JOptionPane.showMessageDialog(null,msg);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
	

