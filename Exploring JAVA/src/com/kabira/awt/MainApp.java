package com.kabira.awt;

import java.awt.*;
import java.awt.event.*; 

public class MainApp {
	
	public static void main(String[] args) {
		Frame frame = new Frame ("First Application ");
		
		frame.setSize(400, 300);
//		frame.setLayout(null);
		frame.setLayout(new GridLayout(2, 2)); // Sets FlowLayout as the layout manager

		Button button = new Button ("Click Here");
		
		frame.add(button);
	
		
		TextField ref1 = new TextField();
		ref1.setBounds(50, 50, 200, 30);
		
		frame.add(ref1);
		
		Label greetref = new Label ("");
		frame.add(greetref);
		
		  button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Get the text from the TextField
	                String name = ref1.getText();
	                // Set the text of the Label
	                if (!name.isEmpty()) {
	                	greetref.setText("Hello, " + name + "!");
	                } else {
	                	greetref.setText("Please enter your name.");
	                }
	            }
	        });

	        // 6. Add a WindowListener to close the application
	        frame.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                frame.dispose();
	            }
	        });
	        
	        
	    	frame.setVisible(true);
		
		
	}

}
