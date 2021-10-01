
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		Robot rob = new Robot();

		rob.setSpeed(50);
		rob.penDown();
		
		String answer = JOptionPane.showInputDialog("What color would you like?");
		
		if(answer.contains("Red") ) {
		rob.setPenColor(Color.red);
			
		}
		else if(answer.contains("Cyan") ) { 
		rob.setPenColor(Color.CYAN);
		}
		else if(answer.contains("Pink")) {
		rob.setPenColor(Color.pink);
		
		}	
		//4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
		
		//6. If the user doesn't enter anything, choose a random color
		
		
		for(int i = 0; i < 4; i++) {
		for(int j = 0; j < 4; j++) {
		rob.move(100);
		rob.turn(90);
		
		}
		rob.turn(90);
		
		}
		
rob.move(100);
//		rob.move(100);
//		rob.turn(90);
//		rob.move(100);
//		rob.turn(90);
//		rob.move(100);
//		//rob.turn(0);
//		rob.move(100);
//		rob.turn(90);
//		rob.move(100);
//		rob.turn(90);
//		rob.move(100);
//		rob.turn(90);
//		rob.move(100);
//		//rob.turn(0);
//		rob.move(100);
//		rob.turn(90);
//		rob.move(100);
//		rob.turn(90);
		
		
		
		
	}

	
		
	}
