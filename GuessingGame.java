package com.coderscampus.GuessingGame;

import java.util.Random;

public class GuessingGame {
    private int theNumber;
    private int maxGuesses;
    private int currentGuesses;
    private boolean hasWon;

    public GuessingGame() {
        Random rand = new Random();
        theNumber = rand.nextInt(100) + 1;
        maxGuesses = 5;
        currentGuesses = 0;
        hasWon = false;
    }

    public String guess(int number) {
    	if (number < 1 || number > 100) {
            return "Your guess is not between 1 and 100, please try again";
        } else if (number != theNumber) {
            currentGuesses++;
            if (number < theNumber) {
                return "Please pick a higher number";
            } else {
                return "Please pick a lower number";
            }
        } else {
            hasWon = true;
            return "You win!";
        }
    }

    public boolean isGameOver() {
        return currentGuesses >= maxGuesses || hasWon;
    }

    public boolean hasWon() {
        return hasWon;
    }

    public int getTheNumber() {
        return theNumber;
    }
}
