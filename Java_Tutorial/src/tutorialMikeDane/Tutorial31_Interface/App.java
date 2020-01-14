package tutorialMikeDane.Tutorial31_Interface;

public class App {

	public static void main(String[] args) {
		
		System.out.println("\n----------------------------------\n");
		
		Cow cow = new Cow();
		cow.eat();
		cow.speak();
		
		System.out.println("\n----------------------------------\n");
		
		Bird bird = new Bird();
		bird.eat();
		bird.speak();
		
		System.out.println("\n----------------------------------\n");
		
		// Or you can create a Dog of type animal
		Animal dog = new Dog();
		dog.eat();
		dog.speak();
		
		System.out.println("\n----------------------------------\n");
		
		/* 
		 * When you can add the interface to the left
		 * it means you can create an array, which stores many different types
		 * of animals, i.e. Dog, Cow, Bird
		 */
		Animal[] animals = {
				new Cow(),
				new Bird(),
				new Dog()
		};
		
		
		for (Animal animal: animals) {
			animal.eat();
			animal.speak();
		}

	}

}
