package com.sbcc.main;

import java.util.Scanner;
import com.sbcc.model.Player;
import com.sbcc.utility.SBCCUtility;

public class UserInterface {

	private static Scanner sc = new Scanner(System.in);

//	public static Player createPlayer() {
//		System.out.println("Enter player Id");
//		String playerId = sc.nextLine();
//		System.out.println("Enter player Name");
//		String playerName = sc.nextLine();
//		System.out.println("Enter the number of matches played");
//		int matchesPlayed = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter the total runs scored");
//		int runScored = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter the playing zone");
//		String playingZone = sc.nextLine();
//
//		return new Player(playerId, playerName, matchesPlayed, runScored, playingZone);
//
//	}

	public static void displayPlayer(Player p) {

		System.out.println("Player id:" + p.getPlayerId());
		System.out.println("Player name:" + p.getPlayerName());
		System.out.println("Matched played:" + p.getMatchesPlayed());
		System.out.println("Total run scored:" + p.getRunScored());
		System.out.println("Playing zone:" + p.getPlayingZone());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p = null;
		SBCCUtility utitlity = new SBCCUtility();
		int choice = 0;
		do {
			System.out.println("1.Validate player details");
			System.out.println("2.Exit");
			System.out.println("Enter your choice");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Enter the player details");
				String playerDetail = sc.nextLine();

				p = utitlity.parsePlayerDetails(playerDetail);
				if (p != null)
					displayPlayer(p);
				else
					System.out.println("Please provide a valid record");
				break;

			case 2:
				System.out.println("Thank you for using SBCC application");
				break;
			default:
				System.out.println("Invalid Choice");
				break;

			}
		} while (choice != 2);
	}

}
