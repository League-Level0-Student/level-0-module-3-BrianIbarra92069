package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Elseifownadventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	int choice = JOptionPane.showOptionDialog(null, "You live in a place where its haunted, and you want to explore around it, what would you use to light your way", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
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
	
	choice = JOptionPane.showOptionDialog(null, "Great, but in the house there are rooms that are odd", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Flashlight", "Glowstick", "Phone", "Lamp" }, null);
	
	String observationTool = "";
	
	if(choice == 0) {
		JOptionPane.showMessageDialog(null, "You picked Flashlight");
		observationTool = "Flashlight";
	}
	
	if(choice == 1) {
		JOptionPane.showMessageDialog(null, "You picked Glowstick");
		observationTool = "Glowstick";
	}
	
	if(choice == 2) {
		JOptionPane.showMessageDialog(null, "You picked Phone");
		observationTool = "Phone";
	}
	
	if(choice == 3) {
		JOptionPane.showMessageDialog(null, "You picked Lamp");
		observationTool = "Lamp";
	}
	
	// i want the person to also equip something that can help them look for odd things.
	
	
	
	
	
	
	
	
	// if(lightsource.equals("Flashlight") { }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}