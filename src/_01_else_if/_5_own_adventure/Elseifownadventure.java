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
	
	
	
	
	
	
	
	
	
	
	
	// if(lightsource.equals("Flashlight") { }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}