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
	 * iterating till winning position
	 */
	
	public static final int WINNING_POSITION = 100;
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Simulation Program ");
		
		//initialising player position
		int player_position = 0;
		
		while ( WINNING_POSITION > player_position ) {
		//die roll giving random no between 1 to 6
			int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		
		//checking for option of no play, ladder or snake after die roll
			int option = (int) (Math.floor(Math.random() * 10) % 3);
			switch (option) {
			case 1:
				System.out.println("No play:" +0);
				player_position += 0;
				break;
			case 2:
				System.out.println("Ladder:" + "+" + die );
				player_position += die;
				break;
			default:
				System.out.println("Snake:" + "-" + die);
				player_position -= die;	
				if (player_position < 0)
					player_position = 0;		
			}
		}
		System.out.println("Player position: " + player_position);
	}
}
