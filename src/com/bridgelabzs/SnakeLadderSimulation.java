package com.bridgelabzs;

/**
 * This problem simulates a Snake and Ladder game
 * @author Sheetal
 * @since 2021-08-07
 */
public class SnakeLadderSimulation {
	/**
	 * creating die roll formula and 
	 * checking for option after die outcome
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Simulation Program ");
		//initialising player position
		int player_position = 0;
		//die roll giving random no between 1 to 6
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("\nDice roll: " + die);
		//checking for option of no play, ladder or snake after die roll
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		switch (option) {
			case 1:
				System.out.println("No play");
				player_position += 0;
				break;
			case 2:
				System.out.println("Ladder");
				player_position += die;
				break;
			default:
				System.out.println("Snake");
				player_position -= die;		
		}
		System.out.println("Player position: " + player_position);
	}
}
