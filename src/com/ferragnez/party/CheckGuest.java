package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner noteDown = new Scanner(System.in); //scanner assignment
		
		String[] invitedGuests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Martina Maccherone", "Pardis Zarei", "Rachel Zeilic"};
		
		// ask user's name
		System.out.println("Please type your Name:");
		String userName = noteDown.nextLine();
		noteDown.close();  // close scanner after use
		
		boolean nameFound = false;
		for (int i = 0; i < invitedGuests.length; i++ ) {
			if (invitedGuests[i] != null && invitedGuests[i].equals(userName)) { // Use equals() to compare strings
				nameFound = true;
				break; // Exit the loop as soon as find the name
			}
		}
		
		if (nameFound) {
            System.out.println("Allowed");
        } else {
            System.out.println("You are not on the guest list");
        }
	}
}
