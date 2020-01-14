package tutorialMikeDane.Tutorial30_Inheritance;

public class ChineseChef extends ItalianChef {
	
	/*
	 *  ChineseChef can use both the italianChef (Which it extends) and the Chef
	 *  (Which ItalianChef extends)
	 */
	
	public void makeFriedRice() {
		System.out.println("The " + getClass().getName().substring(getClass().getName().lastIndexOf('.')+1, getClass().getName().length()) +" makes Fried Rice..");
	}
	
	//Overwrite the superclass method
	public void makeSpecial() {
		System.out.println("The " + getClass().getName().substring(getClass().getName().lastIndexOf('.')+1, getClass().getName().length()) +" makes Orange Chicken..");
	}

}
