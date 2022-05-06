package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Elseifownadventure {

	private static int choice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	choice = JOptionPane.showOptionDialog(null, "You live in a place where its haunted, and you want to explore around it, what would you use to light your way", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Flashlight", "Glowstick", "Phone", "Lamp" }, null);
	
	String lightsource = "";
	
	if(choice == 0) {
		JOptionPane.showMessageDialog(null, "You picked Flashlight");
		lightsource = "Flashlight";
	}
	
	if(choice == 1) {
		JOptionPane.showMessageDialog(null, "You picked Glowstick");
		lightsource = "Glowstick";
	}
	
	if(choice == 2) {
		JOptionPane.showMessageDialog(null, "You picked Phone");
		lightsource = "Phone";
	}
	
	if(choice == 3) {
		JOptionPane.showMessageDialog(null, "You picked Lamp");
		lightsource = "Lamp";
	}
	
	choice = JOptionPane.showOptionDialog(null, "Great, but in the house there are rooms that are odd, Which tool do you want to bring with you", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Hammer", "Saw", "Razor Knife", "Nothing, Just use your fists" }, null);
	
	String observationTool = "";
	
	if(choice == 0) {
		JOptionPane.showMessageDialog(null, "You picked Flashlight");
		observationTool = "Hammer";
	}
	
	if(choice == 1) {
		JOptionPane.showMessageDialog(null, "You picked Glowstick");
		observationTool = "Saw";
	}
	
	if(choice == 2) {
		JOptionPane.showMessageDialog(null, "You picked Phone");
		observationTool = "Razor Knife";
	}
	
	if(choice == 3) {
		JOptionPane.showMessageDialog(null, "You chose to use your hands (ouch)");
		observationTool = "Nothing Just use your fists";
	
		choice = JOptionPane.showOptionDialog(null, "Perfect, but since you'll be around for a while you might get hungry, so to avoid hunger take some snacks with you, what would you like to eat while you're exploring?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Granola Bars x8", "Apples x3", "Popcorn x1", "Cookies x10" }, null);
		
		String food = "";
		
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "You Choose the Granola Bars");
			food = "Granola Bars x8";
		}
		
		if(choice == 1) {
			JOptionPane.showMessageDialog(null, "You chose the Apples");
			food = "Apples x3";
		}
		
		if(choice == 2) {
			JOptionPane.showMessageDialog(null, "You chose The Popcorn");
			food = "Popcorn x1";
		}
		
		if(choice == 3) {
			JOptionPane.showMessageDialog(null, "You chose the Cookies");
			food = "Cookies x10";
			 
		}
	
		choice = JOptionPane.showOptionDialog(null, "Great now you are prepared, now in this house there is only 4 room, and each room has a spirit with different hostile level, Room 1 has a very shy Spirit, Room 2 has a Spirit that likes play jokes all around  ", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Granola Bars x8", "Apples x3", "Popcorn x1", "Cookies x10" }, null);
		
		String  = "";
		
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "You Choose the Granola Bars");
			 = "Granola Bars x8";
		}
		
		if(choice == 1) {
			JOptionPane.showMessageDialog(null, "You chose the Apples");
			 = "Apples x3";
		}
		
		if(choice == 2) {
			JOptionPane.showMessageDialog(null, "You chose The Popcorn");
			 = "Popcorn x1";
		}
		
		if(choice == 3) {
			JOptionPane.showMessageDialog(null, "You chose the Cookies");
			 = "Cookies x10";
			 
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	// i want the person to also equip something that can help them look for odd things.
	
	
	
	
	
	
	
	
	// if(lightsource.equals("Flashlight") { }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}