package tutorialMikeDane;

import java.util.Scanner;

public class Tutorial8_FirstCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter first number to be calculated : ");
		double num1 = input.nextDouble();
		
		System.out.print("Please enter operator : ");
		//input.next will get all data upto a space
		String opperator = input.next();
		
		System.out.print("Please enter second number to be calculated : ");
		double num2 = input.nextDouble();
		
		if(opperator.equals("+")) {
			System.out.print(num1 + num2);
		}else if(opperator.equals("-")) {
			System.out.print(num1 - num2);
		}else if(opperator.equals("*")) {
			System.out.print(num1 * num2);
		}else if(opperator.equals("/")){
			System.out.print(num1 / num2);
		}else {
			System.out.print("Please enter a valid opperator");
		}

	}

}
