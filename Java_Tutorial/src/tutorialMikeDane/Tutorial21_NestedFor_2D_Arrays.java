package tutorialMikeDane;

public class Tutorial21_NestedFor_2D_Arrays {

	public static void main(String[] args) {
		

		//Nested For Loop
		for(int i = 1; i < 3; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		
		System.out.println("___________________________");
		
		//2D Array
		int [][] numberGridDUMMY = new int [3][4];
		
		//Or created like below for easier reading
		int [][] numberGrid = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{0}
		};
		
		//How to print any value in the array
		System.out.println(numberGrid[0][0]);
		System.out.println(numberGrid[1][2]);
		System.out.println(numberGrid[2][1]);
		
		System.out.println("___________________________");
		
		//Loop Around to print all elements in 2D array
		//Nested For Loop
		for(int k = 0; k < numberGrid.length; k++) {
			for(int l = 0; l < numberGrid[k].length; l++) {
				System.out.print(numberGrid[k][l] + "\t");
			}
			System.out.println();
		}
		

	}

}
