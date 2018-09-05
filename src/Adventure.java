import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"You are on a island and your friend is in a ditch but you found a Map \n FULL of gold what are going to do A. Save  your Best friend that you said you are not going to leave behind \n B.Find the gold and not share it and not save your friend");
		int first = Integer.parseInt(JOptionPane.showInputDialog("0 to save your friend or 1 do go  after the gold"));
		if (first == 0) {
			JOptionPane.showMessageDialog(null,
					"Your friend is out of the ditch but the map flew away to a jungle stuck on a brach \n but you are surrondid by sharks A. you and your friend swimm to the island or B. try to build a boat (you have a axe)");
			//JOptionPane.showMessageDialog(null,"you are on the jungle but you see a jaguar A. do you youse your axe to kill it or B.you run away far form it");
			int second = Integer.parseInt(JOptionPane.showInputDialog("2 to kill the jaguar or 3 to run away"));

			if (second == 2) {
				JOptionPane.showMessageDialog(null, "You shank the jaguar and you eat it for dinner");
			}
			else {
				JOptionPane.showMessageDialog(null,"you build a boat and hit the sharks with the extra wood you were yousing \n for the boat");
			} 
				
			
			
			
			
			
			
		} else if (first == 1) {
			JOptionPane.showMessageDialog(null,"you see a Jungle not to far so you build a bout for two people and the treasher map \n loot is on the Jungle (You have axe)");
		
			//JOptionPane.showMessageDialog(null,"you are on the jungle but you find a temple A. you go and explore it or B. you keep on walking and not go in");
		int third = Integer.parseInt(JOptionPane.showInputDialog("4 to go inside the temple or 5 to go away from it"));
		
		if (third == 4) {
			JOptionPane.showMessageDialog(null,"you go inside and there are booby traps and you manage to not get hit but you fall in a secret pasege ");
		}
		else {
			JOptionPane.showMessageDialog(null,"you go away but you start building a house but whene you cut down a tree so many animals come out you /n stop.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}

	}
}
