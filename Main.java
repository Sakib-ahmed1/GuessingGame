package com.coderscampus.GuessingGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		GuessingGame game = new GuessingGame();
		Scanner scanner = new Scanner(System.in);

		while (!game.isGameOver()) {
			System.out.println("Pick a number between 1 and 100");
			int guess = scanner.nextInt();
			System.out.println(game.guess(guess));
		}

		if (!game.hasWon()) {
			System.out.println("You lose, the number to guess was " + game.getTheNumber());
		}

		scanner.close();
	}

}
