package tutorialMikeDane;

public class Tutorial33_MainMethod_NonStaticMethods {

	public static void main(String[] args) {
		
		/*
		 * Inner Methods
		 * Method inside the same Main Class has to also be static, as the main itself is 
		 * static
		 * 
		 * Unless you create an new instance of the main class
		 * 
		 */
		

		Tutorial33_MainMethod_NonStaticMethods myApp = new Tutorial33_MainMethod_NonStaticMethods();
		myApp.sayHi("Vinnie");

	}

	private void sayHi(String name) {
		System.out.println("Hello " + name);
		
	}

}
