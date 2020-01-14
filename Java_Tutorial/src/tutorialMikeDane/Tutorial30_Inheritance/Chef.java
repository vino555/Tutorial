package tutorialMikeDane.Tutorial30_Inheritance;

public class Chef {
	
	public void makeChicken() {
		System.out.println("The " + getClass().getName().substring(getClass().getName().lastIndexOf('.')+1, getClass().getName().length()) + " makes Chicken..");
	}
	
	public void makeSalad() {
		System.out.println("The " + getClass().getName().substring(getClass().getName().lastIndexOf('.')+1, getClass().getName().length()) + " makes Salad..");
	}

	public void makeSpecial() {
		System.out.println("The " + getClass().getName().substring(getClass().getName().lastIndexOf('.')+1, getClass().getName().length()) + " makes BBQ Ribs..");
	}


}
