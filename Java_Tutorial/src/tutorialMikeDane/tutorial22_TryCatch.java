package tutorialMikeDane;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tutorial22_TryCatch {

	public static void main(String[] args) {
		
		/*Please note : 
		 * An exception is when something small issue, i.e. user inputs wrong datatype
		 * they can be caught 
		 * 
		 * An error is a more serious issue, which really should not be caught, however you 
		 * can catch an error also using either
		 * 
		 * 	try {
			} catch (Error e) {
			}
			
			Or
			
		 * 	try {
			} catch (Throwable e) {
			}
			
			Throwable catches exceptions and Errors
		 */
		
		//Create a boolean to control While
		boolean isInvalid;
		double number;  //Create a variable to hold user input
		Scanner input;  //Create a Scanner
		
		System.out.print("Please enter a number : ");

		
		//Loop around while isValidNum = false (i.e. system has not received a valid number)
		do {
			
			try {
				input = new Scanner(System.in);
				
				number = input.nextDouble();
				System.out.println(number);
				isInvalid = false;
			} catch (InputMismatchException ime) {
				System.out.print("Please enter a valid number : ");
				isInvalid = true;
				
			}
		}while(isInvalid);


	}

}
