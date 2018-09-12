import javax.swing.JOptionPane;

public class Numbersorter {
public static void main(String[] args) {
	
	
	String imput = JOptionPane.showInputDialog("Enter a number");
	int num1 = Integer.parseInt(imput);
	imput=JOptionPane.showInputDialog("Enter another number");
	int num2 = Integer.parseInt(imput);
	 
	if (num1>num2) {
		JOptionPane.showMessageDialog(null,num2 + " " + num1);
	}
	else   {
		JOptionPane.showMessageDialog(null,num1 + " " + num2);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
