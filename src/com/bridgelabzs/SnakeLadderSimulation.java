package com.bridgelabzs;

/**
 * This problem simulates a Snake and Ladder game
 * @author Sheetal
 * @since 2021-08-07
 */
public class SnakeLadderSimulation {
	
	/**
	 * creating die roll formula using random and 
	 * checking for option after die outcome using switch case
	 * iterating till winning position(100) using while loop
	 * player gets exact winning position 100
	 */
	
	public static final int WINNING_POSITION = 100;		//constant
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Simulation Program ");
		
		int player_position = 0;		//initialising player position
		
		while ( WINNING_POSITION > player_position ) {
		
			int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			int remainingPosition = WINNING_POSITION - player_position;
			int option = (int) (Math.floor(Math.random() * 10) % 3);
			if( remainingPosition >= die ) {
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
		}
		System.out.println("Player position: " + player_position);
		System.out.println("Congratulations!! Player won the Game");
	}
}
