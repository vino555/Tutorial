package tutorialMikeDane;

import java.util.Scanner;

public class Tutorial07_IO {

	public static void main(String[] arg) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a Name : ");
		String name = input.nextLine();
		
		System.out.print("Please enter a Age : ");
		int age = input.nextInt();
		
		System.out.println("Hello, " + name +" !, can't believe you are " + age + " already!");
		
		
		
		
	}
}
