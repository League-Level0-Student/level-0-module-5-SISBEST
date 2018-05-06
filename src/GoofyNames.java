
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
		String username = JOptionPane.showInputDialog("What is your name?");
		System.out.println(username.toUpperCase());
		System.out.println(username.toLowerCase());
		for (int i = 0; i < username.length(); i++) {
			String NextChar = username.substring(i, i + 1);
			if (i % 2 == 0) {
				NextChar = NextChar.toUpperCase();
			} else {
				NextChar = NextChar.toLowerCase();
			}
			goofyName += NextChar;

		}
		JOptionPane.showMessageDialog(null, "Your Goofy Name Is " + goofyName + "! Try using it!");
	}
}
