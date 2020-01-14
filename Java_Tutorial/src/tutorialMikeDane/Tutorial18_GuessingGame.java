package tutorialMikeDane;

import java.util.Scanner;

public class Tutorial18_GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String secretWord = "Giraffe";
		String guess ="";
		
		int guessCount = 0;
		int guessLimit = 3;
		boolean outOfGuesses = false;
		
		while(!guess.equals(secretWord)) {
			
			if (guessCount>=guessLimit) {
				outOfGuesses = true;
				break;
				
			}else {
				System.out.print("Please enter your Guess : ");
				guess = input.nextLine();
			}

			guessCount++;
			
		}
		
		if(outOfGuesses) {
			System.out.println("YOU LOSE - Please try again!!!");
		}else {
			System.out.println("YOU WIN!!! - You guessed correctly, secret Word was : " + guess);
		}
		

	}

}
