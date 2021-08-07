package com.bridgelabzs;

/**
 * This problem simulates a Snake and Ladder game
 * @author Sheetal
 * @since 2021-08-07
 */
public class SnakeLadderSimulation {
	/**
	 * creating die roll formula
	 * returning random no between 1 to 6 
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Simulation Program ");
		//initialising player position
		int player_position = 0;
		//die roll giving random no between 1 to 6
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("\nDice roll: " + die);
	}
}
