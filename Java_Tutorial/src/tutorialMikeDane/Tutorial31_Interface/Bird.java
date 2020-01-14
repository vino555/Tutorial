package tutorialMikeDane.Tutorial31_Interface;

public class Bird implements Animal{
	
	@Override
	public void eat() {
		System.out.println("eats some seeds");
		
	}

	@Override
	public void speak() {
		System.out.println("Tweet Tweet");
		
	}

}
