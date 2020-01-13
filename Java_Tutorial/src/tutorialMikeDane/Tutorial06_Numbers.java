package tutorialMikeDane;

public class Tutorial06_Numbers {

	public static void main(String[] args) {
		
		System.out.println(3 + 4);
		System.out.println(3 - 4);
		System.out.println(3 / 4);
		System.out.println(3.0 / 4.0);
		System.out.println(3 * 4);
		System.out.println(10 % 3);
		
		System.out.println("    ******      ");
		
		int myInt = 3;
		double myDouble = -5.5;
		
		System.out.println(5 + myInt);
		
		//Adding an int to a double will return a double
		System.out.println(myDouble + myInt);
		
		//Maths class
		//Absolute Number
		System.out.println(Math.abs(myDouble));
		
		//Power (3*3*3)
		System.out.println(Math.pow(myInt, 3));
		
		//Square Root
		System.out.println(Math.sqrt(36));

		//Min
		System.out.println(Math.max(36, 92));
		
		//MAx
		System.out.println(Math.min(36, 92));
		
		//round
		System.out.println(Math.round(myDouble));
		
		//Random
		System.out.println();
	}

}
