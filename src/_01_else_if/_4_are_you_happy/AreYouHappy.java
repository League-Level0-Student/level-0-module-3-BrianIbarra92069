package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	String answer = JOptionPane.showInputDialog(null, "Are you happy");
	
	if(answer.contains("yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	
	}	
	else if(answer.contains("No") ) {
	JOptionPane.showInputDialog(null, "Do you want to be happy");
	
	if (answer.contains("yes") ) {
	JOptionPane.showMessageDialog(null, "Change something");
	}
	else if (answer.contains("No") ) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
}
