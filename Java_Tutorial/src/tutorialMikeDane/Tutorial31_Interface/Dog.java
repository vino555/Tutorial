package tutorialMikeDane.Tutorial31_Interface;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("eats some kibble");
		
	}

	@Override
	public void speak() {
		System.out.println("Woof Woof");
		
	}
	
	

}
