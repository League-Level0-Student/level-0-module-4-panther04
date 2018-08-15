import javax.swing.JOptionPane;

public class Fortnite {
public static void main(String[] args) {
	
	
	
	int score=0;
	
	String fort= JOptionPane.showInputDialog("Which skin Camoflaudes In the bush?");
	
	if(fort.equals("Trex skin")) {
		JOptionPane.showMessageDialog(null,"You got it right");
		score=score+1;
	}
	else {
		
		JOptionPane.showMessageDialog(null,"You need to try again and WRONG!!!");
		}
	
	JOptionPane.showMessageDialog(null,score);
	
	
	String nite= JOptionPane.showInputDialog("What Assualt Rifle(AR)could go to Epic and Legandary");
	
	if(nite.equals("Scar")) {
	JOptionPane.showMessageDialog(null,"Again you are good");
	}
	else {
		JOptionPane.showMessageDialog(null,"get it right next time");
	}
	String dog= JOptionPane.showInputDialog("Where did the meteor Hit");

	if(dog.equals("Dusty Divot")) {
		JOptionPane.showMessageDialog(null,"Wow you need 2 more");
	}
	else {
		JOptionPane.showMessageDialog(null,"If dont get the rest of theme right i am going too hit you with Fortnite");
	}
	String cat=JOptionPane.showInputDialog("What is the most poupular spot");
	
	if (cat.equals("Tilted Towers")) {
		JOptionPane.showMessageDialog(null,"if you get the last one right i have to give you vBucks");
	}
	else {
		JOptionPane.showMessageDialog(null,"if you do not get the next one right you need to play more");
	}
	String fortnite= JOptionPane.showInputDialog("Which gun comes in rare and epic");
	
	if(fortnite.equals("Lmg")) {
		JOptionPane.showMessageDialog(null,"You get 1,000,000vBucks");
	}
	else {
		JOptionPane.showMessageDialog(null,"You have to give me 1,000,000vBucks");
	}
	
}
}
