package com.coderscampus.GuessingGame;

public class GuessingGame {

	private int theNumber;
	private int maxGuesses;
	private int currentGuesses;

	public GuessingGame() {
		theNumber = (int) (Math.random() * 100) + 1;
		maxGuesses = 5;
		currentGuesses = 0;
	}

	public String guess(int number) {
		currentGuesses++;
		if (number < 1 || number > 100) {
			return "Your guess is not between 1 and 100, please try again:";
		} else {
			currentGuesses++;
			if (number < thenumber) {
				return "Please pick a higher number:";
			} else if (number > theNumber) {
				return "Please pick a lower number";
			} else {
				return "You win!";
			}
			
		}
		
	}

	public boolean isGameOver() {
		return currentGuesses >= maxGuesses || hasWon();
	}

	public boolean hasWon() {
		return currentGuesses <= maxGuesses && theNumber == currentGuesses;
	}

	public int getTheNumber() {
		return theNumber;
	}

}
