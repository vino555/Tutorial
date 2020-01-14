package tutorialMikeDane.Tutorial30_Inheritance;

public class App {

	public static void main(String[] args) {
		
		System.out.println("\n----------------------------------\n");
		
		//Create a Chef
		Chef normalChef = new Chef();
		
		//Chef Methods
		normalChef.makeChicken();
		normalChef.makeSalad();
		normalChef.makeSpecial();
		
		System.out.println("\n----------------------------------\n");
		
		//Create an ItalianChef
		ItalianChef italianChef = new ItalianChef();
				
		//Chef Method which we inherited, as we extended the Chef Class
		italianChef.makeChicken();
		italianChef.makeSalad();
		italianChef.makeSpecial();
		//ItalianChef extra method
		italianChef.makeSpaghetti();
		
		System.out.println("\n----------------------------------\n");
		
		//Create an Chinese Chef
		ChineseChef chineseChef = new ChineseChef();
				
		//Chef Method which we inherited, as we extended the Chef Class
		chineseChef.makeChicken();
		chineseChef.makeSalad();
		chineseChef.makeSpecial();
		//ItalianChef extra method
		chineseChef.makeSpaghetti();
		//ChineseChef extra method
		chineseChef.makeFriedRice();


	}

}
