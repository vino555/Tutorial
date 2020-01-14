package tutorialMikeDane.Tutorial30_Inheritance;

public class ItalianChef extends Chef{
	
	public void makeSpaghetti() {
		System.out.println("The " + getClass().getName().substring(getClass().getName().lastIndexOf('.')+1, getClass().getName().length()) +" makes Pasta..");
	}
	
	//Overwrite the superclass method
	public void makeSpecial() {
		System.out.println("The " + getClass().getName().substring(getClass().getName().lastIndexOf('.')+1, getClass().getName().length()) +" makes Pizza..");
	}

}
