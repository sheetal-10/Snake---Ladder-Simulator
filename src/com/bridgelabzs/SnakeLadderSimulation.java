package com.bridgelabzs;

import java.util.Scanner;

/**
 * This problem simulates a Snake and Ladder game 
 * for 2 players
 * @author Sheetal
 * @since 2021-08-07
 */
public class SnakeLadderSimulation {
	
	/**
	 * This is main method where 
	 * players' name are input
	 * using while loop for checking winning condition of both player
	 * printing player name with winning message
	 */
	
	public static final int WINNING_POSITION = 100;		//constant
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        System.out.print("Enter first player name : ");
	        String player1Name = s.next();
	        System.out.print("Enter second player name : ");
	        String player2Name = s.next();
	        int player1Pos = 0;							//initialsing players position
	       	int player2Pos = 0;
		while ( player1Pos <= WINNING_POSITION && player2Pos <= WINNING_POSITION ) {
			if (player1Pos == WINNING_POSITION) {
	        	System.out.println(player1Name + " is winner");
	                break;		
		} else if (player2Pos == WINNING_POSITION) {
	               	System.out.println(player2Name + " is winner");
	               	break;
	        } else {
	                player1Pos = player1(player1Pos, player1Name);
	               	player2Pos = player2(player2Pos, player2Name);
	        	}
		}
	}
	/**
	 * function for player1
	 * creating die roll formula using random
	 * checking for option after die outcome using switch case
	 * iterating till winning position(100) 
	 * displaying player name and position
	 */
	private static int player1(int player1Position, String player1Name) {
        int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int remainingPosition = WINNING_POSITION - player1Position;
        int option = (int) (Math.floor(Math.random() * 10) % 3);
        if (remainingPosition >= die) {
            switch (option) {
                case 0:									//no play
                    break;
                case 1:									//ladder
                    player1Position += die;
                    if (player1Position == WINNING_POSITION)
                        break;
                    else
                        player1(player1Position, player1Name);
                    break;
                default:								//snake
                    player1Position -= die;
                    if (player1Position < 0)
                        player1Position = 0;
            }
            System.out.println(player1Name + " position: " + player1Position);
        }
        return player1Position;
    }

	/**
	 * function for player2
	 * creating die roll formula using random
	 * checking for option after die outcome using switch case
	 * iterating till winning position(100) 
	 * displaying player name and position
	 */
	private static int player2(int player2Position, String player2Name) {
        int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int remainingPosition = WINNING_POSITION - player2Position;
        int option = (int) (Math.floor(Math.random() * 10) % 3);
        if (remainingPosition >= die) {
            switch (option) {
                case 0:									//no play
                    break;
                case 1:									//ladder
                    player2Position += die;
                    if (player2Position == WINNING_POSITION)
                        break;
                    else
                        player2(player2Position, player2Name);
                    break;
                default:								//snake
                    player2Position -= die;
                    if (player2Position < 0)
                        player2Position = 0;
            }
        }
        System.out.println(player2Name + " position: " + player2Position);
        return player2Position;
    }

}
