
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "december 6th";
		String Birthday = "december 6th";
		String myBirthday = "march 9th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
	String Bob=	JOptionPane.showInputDialog("what birthday do ya want");
		// 3. Print out what the user typed
		

		// 4. if user asked for "mom"
		if(Bob.equals("mom"));
		System.out.println(momsBirthday);
		// 5. if user asked for "dad"
		if(Bob.equals("dad"));
		System.out.println(Birthday);
		// print dad's birthday
		// 6. if user asked for your name
		if(Bob.equals("you"));
		System.out.println(myBirthday);
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
