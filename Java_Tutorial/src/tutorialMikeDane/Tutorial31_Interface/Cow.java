package tutorialMikeDane.Tutorial31_Interface;

public class Cow implements Animal{

	@Override
	public void eat() {
		System.out.println("eats some Grass");
		
	}

	@Override
	public void speak() {
		System.out.println("Moo");
		
	}

}
