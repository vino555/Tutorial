package tutorialMikeDane;

import java.util.Scanner;

public class Tutorial09_MadLibsGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a color");
		String color = input.nextLine();
		
		System.out.println("Enter a plural noun");
		String pluralNoun = input.nextLine();
		
		System.out.println("Enter a celebrity");
		String celeb = input.nextLine();
		
		
		System.out.println("Roses are " + color + "\n"
				+ pluralNoun + " are blue \n"
				+ "I love " + celeb);

	}

}
