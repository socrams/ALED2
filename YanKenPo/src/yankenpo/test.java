/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yankenpo;

    import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		//Initialize the Scanner and print a welcome message
		Scanner in = new Scanner(System.in);		
                System.out.println("Welcome to Rock, Paper, Scissors!");

		//Use a while(true) loop and only break the loop if the user wants to quit
		while(true) {
		
			//Get the user's move through user input
			System.out.print("What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter quit. ");
			String myMove = in.nextLine();
			
			//Check if the user wants to quit the game
			if(myMove.equals("quit")) {
				break;
			}

			//Check if the user's move is valid (rock, paper, or scissors)
			if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

				System.out.println("Your move isn't valid!");
			
} else {
int rand = (int)(Math.random()*3);
String opponentMove = "";
if(rand == 0) {
opponentMove = "rock";
} else if(rand == 1) {
opponentMove = "paper";
} else {
opponentMove = "scissors";
}
				System.out.println("Opponent move: " + opponentMove);
					
				//Print the results of the game: tie, lose, win
				if(myMove.equals(opponentMove)) {
					System.out.println("It's a tie!");
				} else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
					System.out.println("You won!");
				} else {
					System.out.println("You lost!");
				}

			}

		}

		//Print a final message for the user
		System.out.println("Thanks for playing Rock, Paper, Scissors!");

  }
}
    
    
  