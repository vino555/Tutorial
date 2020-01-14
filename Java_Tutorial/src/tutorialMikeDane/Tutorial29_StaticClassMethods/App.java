package tutorialMikeDane.Tutorial29_StaticClassMethods;

public class App {

	public static void main(String[] args) {
		
		/* Math Class is an example of how to use static methods
		 * Math Class contains static methods, so we do not need to 
		 * create a Math Class each time we want to use the method as
		 * normal.  Math myMath = new Math()
		 * 
		 * No, instead we can just call the static method directly from any class
		 * Math.Max() for example
		 */
		System.out.println(Math.max(3, 6));
		
		
		/*Call the static method contained in the Prints Class, we don't need to
		 * create a Prints Class just call it directly
		 */
		
		Prints.sayGoodbye();

	}
	
	//Create a static method, sayHi
	public static void sayHi() {
		
	}

}
