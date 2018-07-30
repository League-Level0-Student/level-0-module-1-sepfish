package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		JOptionPane.showMessageDialog(null, "It's riddle time! All these answers are one word.");
		String riddle1 = JOptionPane.showInputDialog("First riddle: You can drop me from the tallest building and I'll be fine, but if you drop me in water I die. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle1.equalsIgnoreCase("Paper")) {
			JOptionPane.showMessageDialog(null, "Hey, you got it right!");
			score = score +1;
		// 5. Otherwise, say "wrong" and tell them the answer
		}else {
			JOptionPane.showMessageDialog(null, "That's not right. The answer was: Paper!");
		}
		// 6. Add some more riddles
		String riddle2 = JOptionPane.showInputDialog("Here's another riddle: What has an eye but cannot see?");
		if (riddle2.equalsIgnoreCase("Needle")) {
			JOptionPane.showMessageDialog(null, "Hey, you got it right!");
			score = score +1;
		// 5. Otherwise, say "wrong" and tell them the answer
		}else {
			JOptionPane.showMessageDialog(null, "That's not right. The answer was: Needle!");
		}
		String riddle3 = JOptionPane.showInputDialog("Here's another riddle: What kind of room has no doors or windows?");
		if (riddle3.equalsIgnoreCase("Mushroom")) {
			JOptionPane.showMessageDialog(null, "Hey, you got it right!");
			score = score +1;
		// 5. Otherwise, say "wrong" and tell them the answer
		}else {
			JOptionPane.showMessageDialog(null, "That's not right. The answer was: Mushroom! Okay, that was kind of bad.");
		}
		String riddle4 = JOptionPane.showInputDialog("Here's another riddle: Forwards I am heavy but backwards I am not. What am I?");
		if (riddle4.equalsIgnoreCase("Ton")) {
			JOptionPane.showMessageDialog(null, "Hey, you got it right!");
			score = score +1;
		// 5. Otherwise, say "wrong" and tell them the answer
		}else {
			JOptionPane.showMessageDialog(null, "That's not right. The answer was: Ton!");
		}
		String riddle5 = JOptionPane.showInputDialog("Last riddle: What invention lets you look through a wall?");
		if (riddle5.equalsIgnoreCase("Window")) {
			JOptionPane.showMessageDialog(null, "Hey, you got it right!");
			score = score +1;
		// 5. Otherwise, say "wrong" and tell them the answer
		}else {
			JOptionPane.showMessageDialog(null, "That's not right. The answer was: Window!");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your final score is " + score + "!");
	}
}

