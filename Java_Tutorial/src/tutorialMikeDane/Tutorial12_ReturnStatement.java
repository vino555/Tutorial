package tutorialMikeDane;

import java.util.Scanner;

public class Tutorial12_ReturnStatement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter the number you wish to cude : ");
		int number = input.nextInt();
		
		System.out.println(getCube(number));
	}
	
	public static int getCube(int num) {
		int cube = (num * num * num);
		return cube;
	}

}
