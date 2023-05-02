package com.enums;

public class SwitchEnum {

	// Declaring Enum keyword
	// inside main class
	enum Webseries {
		GOT, Breakingbad, Lucifer, Boys, Mirzapur, Moneyheist;
	}

	public static void main(String[] args) {
		// Declaring and Assigning choice to variable 'wb'
		Webseries wb = Webseries.Mirzapur;

		// Switch Keyword

		switch (wb) {

		// Case statements
		case GOT:
			System.out.println("Game of Thrones selected");
			break;
		case Breakingbad:
			System.out.println("Breaking Bad selected");
			break;
		case Lucifer:
			System.out.println("Lucifer selected");
			break;
		case Boys:
			System.out.println("Boys selected");
			break;
		case Mirzapur:
			System.out.println("Mirzapur selected");
			break;
		case Moneyheist:
			System.out.println("Money Heist selected");
			break;
		default:
			System.out.println("You are outdated !!!");
			break;
		}
	}
}
