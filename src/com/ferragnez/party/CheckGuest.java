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
		
}
