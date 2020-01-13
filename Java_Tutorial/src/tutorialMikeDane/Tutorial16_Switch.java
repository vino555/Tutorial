package tutorialMikeDane;

import java.util.Scanner;

public class Tutorial16_Switch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a Day Number");
		int dayNumber = input.nextInt();
		System.out.println(getDayName(dayNumber));

	}
	
	public static String getDayName(int dayNum) {
		
		String dayName = "";
		
		switch(dayNum) {
		case 0: dayName = "Sunday";
				break;
		case 1: dayName = "Monday";
				break;
		case 2: dayName = "Tuesday";
				break;
		case 3: dayName = "Wednesday";
				break;
		case 4: dayName = "Thursday";
				break;
		case 5: dayName = "Friday";
				break;
		case 6: dayName = "Saturday";
				break;
		default:
				dayName = "Invalid Day Number";
				break;
		}
		
		return dayName;
		
	}

}
