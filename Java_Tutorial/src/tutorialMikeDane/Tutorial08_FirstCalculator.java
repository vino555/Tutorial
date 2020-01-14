package tutorialMikeDane;

import java.util.Scanner;

public class Tutorial08_FirstCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter first number to be calculated : ");
		double num1 = input.nextDouble();
		
		System.out.print("Please enter second number to be calculated : ");
		double num2 = input.nextDouble();
		
		System.out.println(num1 + num2);

	}

}
